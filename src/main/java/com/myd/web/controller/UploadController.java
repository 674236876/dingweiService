package com.myd.web.controller;

import com.myd.utils.Response;
import com.myd.utils.ReturnFormat;
import com.myd.web.service.CarRecorderManagerService;
import com.myd.web.service.ImageReportService;
import com.myd.web.service.VideoReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * Created by zhugp on 2017/3/29.
 */
@RestController
@RequestMapping("/file")
public class UploadController {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    @Resource
    private ImageReportService imageReportService;

    @Resource
    private VideoReportService videoReportService;

    @Resource
    private CarRecorderManagerService carRecorderManagerService;

    /**
     * 上传图片接口，可上传多个
     *
     * 注意，上传图片时
     *
     * @param files     文件数组
     * @param remark    备注
     * @param lon       经度
     * @param lat       纬度
     * @param ptId      终端id
     * @param imsi      imsi号
     * @return          response结果
     */
    @RequestMapping(value = "/ImgFile", method = RequestMethod.POST)
    public Response uploadImgFile(@RequestParam(value = "file", required = false) MultipartFile[] files, String remark, String lon, String lat, String batchNum,String ptId,String imsi) {
        if (files == null || lon.trim().isEmpty() || lat.trim().isEmpty() || batchNum == null) {
            return ReturnFormat.retParam(2010);
        }
        //ptId登录时已被加入新字段，使用“-”隔开，前为标志位字段，后为ptId
        ptId = ptId.split("-")[1];
        StringBuilder filesDetail = new StringBuilder();
        for (MultipartFile multipartFile : files) {
            filesDetail.append("文件名-->").append(multipartFile.getOriginalFilename());
            filesDetail.append(";文件大小-->").append(multipartFile.getSize()).append("字节");
            filesDetail.append("\n");
        }
        logger.info("终端调用上传图片接口，传入" + files.length + "个文件"
                + "\n文件详情:\n" + filesDetail
                + "\nremark-->" + remark
                + "\nlon-->" + lon + "\nlat-->" + lat
                + "\nbatchNum-->" + batchNum
                + "\nptId-->" + ptId
                +"\nimsi-->"+imsi);

        return imageReportService.uploadImageFile(files, ptId, batchNum, remark, lon, lat,imsi);
    }

    /**
     * 视频文件上传接口
     * @param files     文件数组
     * @param remark    备注
     * @param lon       经度
     * @param lat       纬度
     * @param ptId      终端id
     * @param imsi      imsi号
     * @return          response结果
     */
    @RequestMapping(value = "/VideoFile", method = RequestMethod.POST)
    public Response uploadVideoFile(@RequestParam(value = "file", required = false) MultipartFile[] files, String remark, String lon, String lat, String ptId,String imsi) {
        if (files == null || lon.trim().isEmpty() || lat.trim().isEmpty() ) {
            return ReturnFormat.retParam(2010);
        }
        //ptId登录时已被加入新字段，使用“-”隔开，前为标志位字段，后为ptId
        ptId = ptId.split("-")[1];
        StringBuilder filesDetail = new StringBuilder();
        for (MultipartFile multipartFile : files) {
            filesDetail.append("文件名-->").append(multipartFile.getOriginalFilename());
            filesDetail.append(";文件大小-->").append(multipartFile.getSize()).append("字节");
            filesDetail.append("\n");
        }
        logger.info("终端调用上传图片接口，传入" + files.length + "个文件"
                + "\n文件详情-->" + filesDetail
                + "\nremark-->" + remark
                + "\nlon-->" + lon + "\nlat-->" + lat
                + "\nptId-->" + ptId
                + "\nimsi-->" + imsi);

        return videoReportService.uploadVideoFile(files, ptId, remark, lon, lat, imsi);
    }


    /**
     * 对讲录音文件上传接口
     * @param file 录音文件
     * @param ptId 终端id
     * @param lon 经度
     * @param lat 纬度
     * @param imsi 终端imsi号
     * @return 上传结果
     */
    @RequestMapping(value = "/RecordFile",method = RequestMethod.POST)
    public Response uploadRecordFile(@RequestParam(value = "file", required = false) MultipartFile file, String ptId, String lon, String lat, String imsi) {
        if (file == null || ptId.trim().isEmpty() || lon.trim().isEmpty() || lat.trim().isEmpty() || imsi.trim().isEmpty()) {
            return ReturnFormat.retParam(2010);
        }
        //ptId登录时已被加入新字段，使用“-”隔开，前为标志位字段，后为ptId
        ptId = ptId.split("-")[1];
        StringBuilder filesDetail = new StringBuilder();
        filesDetail.append("文件名-->").append(file.getOriginalFilename());
        filesDetail.append(";文件大小-->").append(file.getSize()).append("字节");
        filesDetail.append("\n");
        logger.info("终端调用上传录音接口。"
                + "\n文件详情-->" + filesDetail
                + "\n终端id-->" + ptId
                + "\n经度-->" + lon
                + "\n纬度-->" + lat
                + "\nimsi-->" + imsi);
        return carRecorderManagerService.uploadRecordFile(file, ptId, lon, lat, imsi);
    }
}
