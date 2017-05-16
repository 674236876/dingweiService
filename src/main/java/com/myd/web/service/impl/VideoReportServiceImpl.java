package com.myd.web.service.impl;

import com.myd.core.generic.GenericDao;
import com.myd.core.generic.GenericServiceImpl;
import com.myd.utils.FileUtil;
import com.myd.utils.JdbcTemplateUtils;
import com.myd.utils.Response;
import com.myd.web.dao.VideoreportMapper;
import com.myd.web.enums.FileType;
import com.myd.web.model.Videoreport;
import com.myd.web.model.VideoreportExample;
import com.myd.web.service.VideoReportService;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by zhugp on 2017/3/29.
 */
@Service
public class VideoReportServiceImpl extends GenericServiceImpl<Videoreport,Integer> implements VideoReportService{

    private static JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();

    private static final String VIDEOFILE = "mp4";
    private static final String IMGFILE = "jpg";

    @Resource
    private VideoreportMapper videoreportMapper;

    @Override
    public GenericDao<Videoreport, Integer> getDao() {
        return videoreportMapper;
    }

    @Override
    public int insert(Videoreport videoreport) {
        return videoreportMapper.insertSelective(videoreport);
    }

    @Override
    public int update(Videoreport videoreport) {
        return videoreportMapper.updateByPrimaryKeySelective(videoreport);
    }

    @Override
    public int delete(Integer id) {
        return videoreportMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Videoreport selectById(Integer id) {
        return videoreportMapper.selectByPrimaryKey(id);
    }

    @Override
    public Videoreport selectOne() {
        return null;
    }

    @Override
    public List<Videoreport> selectList() {
        VideoreportExample example = new VideoreportExample();
        return videoreportMapper.selectByExample(example);
    }

    /**
     * 上传视频
     * 视频文件包括缩略图（2个文件）
     * 实现逻辑：
     * 1.遍历上传文件，由于网络请求异步关系，可能存在一个http包中视频文件与图片文件随机顺序排列，为了防止无效文件，当上传文件其中一个文件失败时检测是否已保存另一文件
     * 2.当保存视频文件时，如果视频文件保存失败，会继续查看对应目录下是否保存缩略图，如果存在缩略图则将其删除，类似事务回滚
     * 3.缩略图同理
     *
     * @param files     文件数组
     * @param ptId      终端id
     * @param remark    备注
     * @param lon       经度
     * @param lat       纬度
     * @param imsi      imsi号
     * @return 程序执行结果
     */
    @Override
    public Response uploadVideoFile(MultipartFile[] files, String ptId, String remark, String lon, String lat,String imsi) {
        String videoSavePath = "";
        String imageSavePath = "";
        for (MultipartFile file : files) {
            String fileName = file.getOriginalFilename();
            String fileType = fileName.substring(fileName.indexOf(".") + 1);
            if (VIDEOFILE.equals(fileType)) {
                //重置文件名称
                videoSavePath = FileUtil.modifyFileName(file, FileType.VIDEOFILE, ptId,"");
                //保存文件到本地,如果视频文件保存失败则查找是否已经保存了缩略图，如果已保存缩略图则需要将其删除
                if (!FileUtil.saveFileToLocal(file, videoSavePath)) {
                    File imageFile = new File(imageSavePath);
                    if (imageFile.exists()) {
                        imageFile.delete();
                    }
                    return new Response().failure("保存文件失败");
                }
                //将上传信息保存至新数据库
//                this.save(ptId, remark, lon, lat, videoSavePath, imsi);
                //将上传信息保存至老数据库
                this.saveDingweiTable(ptId, remark, lon, lat, videoSavePath, imsi);
            } else {
                //保存图片文件,与视频文件保存在同目录下
                imageSavePath = videoSavePath.replace(VIDEOFILE,IMGFILE);
                if (!FileUtil.saveFileToLocal(file, imageSavePath)) {
                    File videoFile = new File(videoSavePath);
                    if (videoFile.exists()) {
                        videoFile.delete();
                    }
                    return new Response().failure("保存文件失败");
                }
            }
        }
        return new Response().success();
    }

    /**
     * 保存数据到旧表
     * 为保证老平台能够找到对对应文件，根据老平台tomcat server.xml配置将data去掉保存至数据库
     * @param ptId              终端id
     * @param remark            备注
     * @param lon               经度
     * @param lat               纬度
     * @param videoSavePath     保存地址
     * @param imsi              imsi号
     */
    private void saveDingweiTable(String ptId, String remark, String lon, String lat, String videoSavePath, String imsi) {
        if (videoSavePath.contains("/data")) {
            videoSavePath = videoSavePath.replace("/data", "");
        }
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
        final String sql = "insert into CAR_VIDEOMANAGER (ptId,sn,time,path,lat,lon,speed) values (?,?,?,?,?,?,?) ";
        try {
            jdbcTemplate.update(sql, ptId, imsi, sf.format(new Date()), videoSavePath, lat, lon, 0);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    //保存数据至新表 暂时不适用
    public void save(String ptId,String remark, String lon, String lat, String savePath,String imsi) {
        Videoreport model = new Videoreport();
        model.setPtid(ptId);
        model.setLat(lat);
        model.setLon(lon);
        model.setWorktime(new Date());
        model.setFilepath(savePath);
        model.setRemark(remark);
        model.setImsi(imsi);
        this.insert(model);
    }

}
