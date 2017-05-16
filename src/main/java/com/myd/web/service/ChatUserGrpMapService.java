package com.myd.web.service;

import com.myd.core.generic.GenericService;
import com.myd.web.model.ChatusergrpMap;

import java.util.List;

/**
 * Created by zhugp on 2017/3/29.
 */
public interface ChatUserGrpMapService extends GenericService<ChatusergrpMap,String>{
    List<ChatusergrpMap> selectByPhoneNum(String phoneNum);

    List<String> selectByPhoneNumDistinct(String phoneNum);

    List<String> selectByGroupDistinct(String groupName);
}
