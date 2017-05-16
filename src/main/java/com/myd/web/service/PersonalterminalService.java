package com.myd.web.service;

import com.myd.core.generic.GenericService;
import com.myd.web.model.PersonalTerminal;

import java.util.List;
import java.util.Map;

/**
 * Created by zhugp on 2017/3/15.
 */
public interface PersonalterminalService extends GenericService<PersonalTerminal,Long> {

    PersonalTerminal selectByPhoneNum(String phoneNum);

    /**
     * 根据终端id获取所在的企业id
     * @param ptId 终端id
     * @return entId
     */
    String getEntIdByptId(Long ptId);

    PersonalTerminal selectByImsi(String imsi);

    Map selectByImsiAsJdbc(String imsi);

    String getEntIdByPtIdAsJdbc(String ptId);

    String getGroupIdByPtIdAsJdbc(String ptId);

    List getTerminalsByGroupIdAsjdbc(String entGroupId);

    Map selectByIdAsJdbc(String ptId);
}
