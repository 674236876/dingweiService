package com.myd.web.controller;

import com.myd.utils.Response;
import com.myd.utils.ReturnFormat;
import com.myd.web.service.POIService;
import com.myd.web.service.PersonalterminalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhugp on 2017/3/29.
 */
@RequestMapping(value = "/poi")
@RestController
public class POIController {

    private static final Logger logger = LoggerFactory.getLogger(POIController.class);

    @Resource
    private POIService poiService;

    @Resource
    private PersonalterminalService personalterminalService;

    @RequestMapping(value = "/pushPOIInfo", method = RequestMethod.POST)
    public Response pushPOIInfo(@RequestParam String ptId, String lat, String lon, String label,String position,String content) {
        logger.info("终端调用/poi/pushPOIInfo接口，传入参数：ptId=" + ptId
                + "\nlat=" + lat
                + "\nlon=" + lon
                + "\ncontent=" + content
                + "\nlabel=" + label
                + "\nposition=" + position
                +"\ncontent=" + content);
        if (ptId == null || lat.isEmpty() || lon.isEmpty() || position.isEmpty()) {
            return ReturnFormat.retParam(2010);
        }
        //ptId登录时已被加入新字段，使用“-”隔开，前为标志位字段，后为ptId
        ptId = ptId.split("-")[1];
        String entid = personalterminalService.getEntIdByPtIdAsJdbc(ptId);
        if ("".equals(entid)) {
            return ReturnFormat.retParam(3005);
        }
        poiService.addPoi(entid,ptId, lat, lon, label, position, content);
        return new Response().success();
    }
}
