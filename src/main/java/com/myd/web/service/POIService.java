package com.myd.web.service;

import com.myd.core.generic.GenericService;
import com.myd.web.model.PoiInfo;

/**
 * Created by zhugp on 2017/3/29.
 */
public interface POIService extends GenericService<PoiInfo,String>{
    void addPoi(String entId,String ptId, String lat, String lon, String label, String position, String content);
}
