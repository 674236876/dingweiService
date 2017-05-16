package com.myd.web.service;

import com.myd.core.generic.GenericService;
import com.myd.utils.Response;
import com.myd.web.model.Videoreport;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zhugp on 2017/3/29.
 */
public interface VideoReportService extends GenericService<Videoreport, Integer> {
    Response uploadVideoFile(MultipartFile[] files, String ptId, String remark, String lon,String  lat,String imsi);

    void save(String ptId,String remark, String lon, String lat, String savePath,String imsi);
}
