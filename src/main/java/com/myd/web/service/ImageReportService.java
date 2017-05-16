package com.myd.web.service;

import com.myd.core.generic.GenericService;
import com.myd.utils.Response;
import com.myd.web.model.Imagereport;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zhugp on 2017/3/29.
 */
public interface ImageReportService extends GenericService<Imagereport, Integer> {

    Response uploadImageFile(MultipartFile[] file, String ptId, String batchNum,String remark, String lon, String lat,String imsi);

    void save(String ptId,String remark, String lon, String lat, String batchNum, String savePath,String imsi);

    boolean saveFileAtDingweiUrl(String ptId, String lon, String lat, String savePath, String imsi);
}
