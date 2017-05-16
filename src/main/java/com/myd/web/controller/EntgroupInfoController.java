package com.myd.web.controller;

import com.myd.utils.Response;
import com.myd.utils.ReturnFormat;
import com.myd.web.service.EntgroupInfoService;
import com.myd.web.service.PersonalterminalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by zhugp on 2017/3/31.
 */
@RestController
@RequestMapping(value = "/EntGroup")
public class EntgroupInfoController {

    private static final Logger logger = LoggerFactory.getLogger(EntgroupInfoController.class);

    @Resource
    private PersonalterminalService personalterminalService;

    @Resource
    private EntgroupInfoService entgroupInfoService;

    /**
     * 返回企业下所有对讲群组人员列表接口
     *
     * @param entId
     * @return
     */
    @RequestMapping(value = "/groupAndTerms", method = RequestMethod.GET)
    public Response getAllGroupAndTerm(@RequestParam String entId) {
        logger.info("终端调用groupAndTerms接口，entId-->" + entId);
        if (entId.trim().isEmpty()) {
            return ReturnFormat.retParam(2010);
        }
        //通过企业id查询出的对讲组集合 包含字段groupID，name
        List list = entgroupInfoService.selectListByEntIdAsJdbc(entId);
        List<Object> returnList = new ArrayList<>();
        Map<String, Object> entGroupMap = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map<String, Object> map = new HashMap<>();
            if (entGroupMap != null) {
                entGroupMap.clear();
            }
            entGroupMap = (Map) it.next();
            String entGroupId = entGroupMap.get("GROUPID").toString();
            List personalterms = personalterminalService.getTerminalsByGroupIdAsjdbc(entGroupId);
            if (personalterms == null) {
                continue;
            }
            map.put("groupName", entGroupMap.get("NAME").toString());
            map.put("terms", personalterms);
            returnList.add(map);
        }
        return new Response().success(returnList);
    }

    /**
     * 返回终端所属组所有终端
     *
     * @param ptId 终端id
     * @return
     */
    @RequestMapping(value = "/belongGroupTerms", method = RequestMethod.GET)
    public Response getBelongGroupTerms(@RequestParam String ptId) {
        logger.info("终端调用belongGroupTerms接口，ptId-->" + ptId);
        if (ptId.trim().isEmpty()) {
            return ReturnFormat.retParam(2010);
        }
        //ptId登录时已被加入新字段，使用“-”隔开，前为标志位字段，后为ptId
        ptId = ptId.split("-")[1];
        String groupId = personalterminalService.getGroupIdByPtIdAsJdbc(ptId);
        if ("".equals(groupId)) {
            return ReturnFormat.retParam(3002);
        }
        String groupName = entgroupInfoService.getGroupNameByIdAsJdbc(groupId);
        List list = personalterminalService.getTerminalsByGroupIdAsjdbc(groupId);
        if (list == null) {
            return ReturnFormat.retParam(3002);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("groupName", groupName);
        map.put("terms", list);
        return new Response().success(map);
    }


    /**
     * 返回对讲群组人员列表接口
     * 暂时注释，使用旧定位平台的db2数据库
     * @param ptId
     * @return
     */
//    @RequestMapping(value = "/groupAndTerms", method = RequestMethod.GET)
//    public Response getAllGroupAndTerm(@RequestParam String ptId) {
//        logger.info("终端调用groupAndTerms接口，ptId-->"+ptId);
//        if (ptId.trim().isEmpty()) {
//            return ReturnFormat.retParam(2010);
//        }
//        ptId登录时已被加入新字段，使用“-”隔开，前为标志位字段，后为ptId
//        ptId = ptId.split("-")[1];
//        PersonalTerminal pt = personalterminalService.selectById(Long.parseLong(ptId));
//        if (pt == null) {
//            return ReturnFormat.retParam(3001);
//        }
//        EntgroupInfo e = entgroupInfoService.selectById(pt.getGroupid());
//        if (e == null) {
//            return ReturnFormat.retParam(3002);
//        }
//        Long entId = e.getEntid();
//        List<EntgroupInfo> list = entgroupInfoService.selectListByEntId(entId);
//        List<Object> returnList = new ArrayList<>();
//        for (EntgroupInfo entGroup : list) {
//            Map<String, Object> map = new HashMap<>();
//            map.put("groupName", entGroup.getName());
//            map.put("terms", entGroup.getPersonalTerminals());
//            returnList.add(map);
//        }
//        return new Response().success(returnList);
//    }


    /**
     * 返回所属组所有终端
     *
     * @param ptId
     * @return
     */
//    @RequestMapping(value = "/belongGroupTerms", method = RequestMethod.GET)
//    public Response getBelongGroupTerms(@RequestParam String ptId) {
//        logger.info("终端调用belongGroupTerms接口，ptId-->" + ptId);
//        if (ptId.trim().isEmpty()) {
//            return ReturnFormat.retParam(2010);
//        }
//        ptId登录时已被加入新字段，使用“-”隔开，前为标志位字段，后为ptId
//        ptId = ptId.split("-")[1];
//        PersonalTerminal pt = personalterminalService.selectById(Long.parseLong(ptId));
//        if (pt == null) {
//            return ReturnFormat.retParam(3001);
//        }
//        EntgroupInfo e = entgroupInfoService.selectById(pt.getGroupid());
//        if (e == null) {
//            return ReturnFormat.retParam(3002);
//        }
//        Map<String, Object> map = new HashMap<>();
//        map.put("groupName", e.getName());
//        map.put("terms", e.getPersonalTerminals());
//        return new Response().success(map);
//    }
}
