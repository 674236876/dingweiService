package com.myd.web.service;

import com.myd.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zhugp on 2017/4/21.
 */
public interface CarRecorderManagerService{

    Response uploadRecordFile(MultipartFile file, String ptId, String lon, String lat, String imsi);

    void save(String savePath, String ptId, String lon, String lat, String imsi);
}
