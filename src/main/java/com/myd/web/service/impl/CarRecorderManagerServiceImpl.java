package com.myd.web.service.impl;

import com.myd.utils.FileUtil;
import com.myd.utils.JdbcTemplateUtils;
import com.myd.utils.Response;
import com.myd.utils.ReturnFormat;
import com.myd.web.enums.FileType;
import com.myd.web.service.CarRecorderManagerService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhugp on 2017/4/21.
 */
@Service
public class CarRecorderManagerServiceImpl implements CarRecorderManagerService{

    private static JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();

    @Override
    public Response uploadRecordFile(MultipartFile file, String ptId, String lon, String lat, String imsi) {
        String savePath = getSavePath(file, ptId);
        if (savePath.isEmpty()) {
            return ReturnFormat.retParam(1003);
        }
        //该操作数据值queck4j表中
        try {
            this.save(savePath, ptId, lon, lat, imsi);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnFormat.retParam(1007);
        }
        return new Response().success();
    }

    @Override
    public void save(String savePath, String ptId, String lon, String lat, String imsi) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
        String sql = "insert into car_recordermanager (ptid,sn,time,path,lat,lon,speed) values (?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{ptId, imsi, sf.format(new Date()), savePath, lat, lon, 0});
    }

    private String getSavePath(MultipartFile file,String ptId) {
        String savePath = FileUtil.modifyFileName(file, FileType.RECORDFILE, ptId,"");
        if (!FileUtil.saveFileToLocal(file, savePath)) {
            return "";
        }
        return savePath;
    }
}
