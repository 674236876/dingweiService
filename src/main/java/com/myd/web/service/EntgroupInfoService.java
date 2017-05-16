package com.myd.web.service;

import com.myd.core.generic.GenericService;
import com.myd.web.model.EntgroupInfo;

import java.util.List;

/**
 * Created by zhugp on 2017/3/31.
 */
public interface EntgroupInfoService extends GenericService<EntgroupInfo,Long>{
    List<EntgroupInfo> selectListByEntId(Long entid);

    List selectListByEntIdAsJdbc(String entid);

    String getGroupNameByIdAsJdbc(String groupId);
}
