package com.myd.web.service.impl;

import com.myd.core.generic.GenericDao;
import com.myd.core.generic.GenericServiceImpl;
import com.myd.utils.*;
import com.myd.web.dao.ImagereportMapper;
import com.myd.web.enums.FileType;
import com.myd.web.model.Imagereport;
import com.myd.web.model.ImagereportExample;
import com.myd.web.service.ImageReportService;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by zhugp on 2017/3/29.
 */
@Service
public class ImageReportServiceImpl extends GenericServiceImpl<Imagereport,Integer> implements ImageReportService {

    @Resource
    private ImagereportMapper imagereportMapper;

    private static JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();

    @Override
    public GenericDao<Imagereport, Integer> getDao() {
        return imagereportMapper;
    }

    /**
     * 图片上传
     * @param multipartFiles    文件流
     * @param ptId              终端Id
     * @param batchNum          批次号
     * @param remark            备注
     * @param lon               经度
     * @param lat               纬度
     * @return                  请求结果
     */
    public Response uploadImageFile(MultipartFile[] multipartFiles, String ptId, String batchNum, String remark, String lon, String lat,String imsi) {
        for (MultipartFile file : multipartFiles) {
            String savePath = getSavePath(file, ptId, batchNum);
            if (savePath.isEmpty()) {
                return ReturnFormat.retParam(1003);
            }
            //该操作数据值queck4j表中
            try {
                this.save(ptId, remark, lon, lat, batchNum, savePath, imsi);
            } catch (Exception e) {
                e.printStackTrace();
                return ReturnFormat.retParam(1003);
            }
            //该操作保存数据到dingwei平台表中
            //当重写dingwei平台后，该方法需要移除
            if(!this.saveFileAtDingweiUrl(ptId, lon, lat, savePath,imsi)){
                return ReturnFormat.retParam(1003);
            }
        }
        return new Response().success();
    }

    /**
     * 修改文件名保存文件
     * @param file      文件
     * @param ptId      终端id
     * @param batchNum  批次号
     * @return  文件保存路径
     */
    private String getSavePath(MultipartFile file,String ptId,String batchNum) {
        String savePath = FileUtil.modifyFileName(file, FileType.IMGFILE, ptId, batchNum);
        if (!FileUtil.saveFileToLocal(file, savePath)) {
            return "";
        }
        return savePath;
    }

    /**
     * 保存信息
     * @param ptId      终端id
     * @param remark    备注
     * @param lon       经度
     * @param lat       纬度
     * @param batchNum  批次号
     * @param savePath  保存地址
     */
    public void save(String ptId,String remark, String lon, String lat, String batchNum, String savePath,String imsi) {
        Imagereport model = new Imagereport();
        model.setPtid(ptId);
        model.setLat(lat);
        model.setLon(lon);
        model.setBatchnum(batchNum);
        model.setWorktime(new Date());
        model.setFilepath(savePath);
        model.setRemark(remark);
        model.setImsi(imsi);
        this.insert(model);
    }

    @Override
    public int insert(Imagereport imagereport) {
        return imagereportMapper.insertSelective(imagereport);
    }

    @Override
    public int update(Imagereport imagereport) {
        return imagereportMapper.updateByPrimaryKeySelective(imagereport);
    }

    @Override
    public int delete(Integer id) {
        return imagereportMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Imagereport selectById(Integer id) {
        return imagereportMapper.selectByPrimaryKey(id);
    }

    @Override
    public Imagereport selectOne() {
        return null;
    }

    @Override
    public List<Imagereport> selectList() {
        ImagereportExample example = new ImagereportExample();
        return imagereportMapper.selectByExample(example);
    }


    /**
     * 保存文件到dingwei平台相关数据库以及路径
     * @param ptId  终端id
     * @param lon   经度
     * @param lat   纬度
     * @param savePath  文件保存路径
     * @param imsi  imsi号
     */
    public boolean saveFileAtDingweiUrl(String ptId, String lon, String lat, String savePath, String imsi) {
        String fileName = savePath.substring(savePath.lastIndexOf("/") + 1);
        boolean isSuccess = FileUtil.copyFileToAnotherDir(savePath, "/data/carImage/" + imsi + "/1/" + fileName.substring(0, 8) + "/" + fileName.substring(8));
        if (isSuccess) {
            oldTableSave(ptId, lon, lat, savePath);
            return true;
        }else{
            return false;
        }
    }

    /**
     * 用于保存数据到dingwei数据库，供老平台使用
     * @param ptId      终端id
     * @param lon       经度
     * @param lat       纬度
     * @param savePath  保存路径
     * @return
     */
    private void oldTableSave(String ptId,String lon, String lat,String savePath) {
        String fileName = savePath.substring(savePath.lastIndexOf("/")+1);
        String time = fileName.substring(0, fileName.indexOf("."));
        final String sql = "INSERT INTO ws_workreport (PTID,SYSTIME,WORKTIME,TYPE,HASPHOTO,CONTENT,LON,LAT,ALARMTYPE,ALARMSTATUS,PARAM) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            jdbcTemplate.update(sql, ptId, time, time, 4, 1, "", lon, lat, 2, 0, "");
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}
