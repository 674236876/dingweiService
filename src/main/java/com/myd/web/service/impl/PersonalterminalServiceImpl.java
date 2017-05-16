package com.myd.web.service.impl;

import com.myd.core.generic.GenericDao;
import com.myd.core.generic.GenericServiceImpl;
import com.myd.utils.JdbcTemplateUtils;
import com.myd.web.dao.PersonalterminalMapper;
import com.myd.web.model.PersonalTerminal;
import com.myd.web.model.PersonalterminalExample;
import com.myd.web.service.PersonalterminalService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhugp on 2017/3/15.
 */
@Service
public class PersonalterminalServiceImpl extends GenericServiceImpl<PersonalTerminal, Long> implements PersonalterminalService {

    @Resource
    private PersonalterminalMapper personalterminalMapper;

    private JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();

    @Override
    public GenericDao<PersonalTerminal, Long> getDao() {
        return personalterminalMapper;
    }

    @Override
    public List<PersonalTerminal> selectList() {
        return personalterminalMapper.selectByExample(null);
    }

    @Override
    public PersonalTerminal selectByPhoneNum(String phoneNum) {
        PersonalterminalExample example = new PersonalterminalExample();
        example.createCriteria().andPhonenumberEqualTo(phoneNum);
        List<PersonalTerminal> list = personalterminalMapper.selectByExample(example);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public String getEntIdByptId(Long ptId) {
        return personalterminalMapper.getEntIdByptId(ptId);
    }

    @Override
    public PersonalTerminal selectByImsi(String imsi) {
        PersonalterminalExample example = new PersonalterminalExample();
        example.createCriteria().andImsiEqualTo(imsi);
        List<PersonalTerminal> list = personalterminalMapper.selectByExample(example);
        return list.size() == 0 ? null : list.get(0);
    }

    @Override
    public String getEntIdByPtIdAsJdbc(String ptId) {
        String sql = "select entid from personalterm_info where ptId= ?";
        List list = jdbcTemplate.queryForList(sql, ptId);
        if (list.size() == 0) {
            return "";
        }
        return ((Map)list.get(0)).get("ENTID").toString();
    }

    @Override
    public Map selectByImsiAsJdbc(String imsi) {
        String sql = "select ptid,isactive,Name,phoneNumber from personalterm_info where serialnumber = '"+ imsi+"'";
        List list = jdbcTemplate.queryForList(sql);
        if (list.size() == 0) {
            return null;
        }
        return (Map) list.get(0);
    }

    @Override
    public String getGroupIdByPtIdAsJdbc(String ptId) {
        String sql = "select groupid from personalterm_info where ptid = ?";
        List list = jdbcTemplate.queryForList(sql, ptId);
        if (list.size() == 0) {
            return "";
        }
        return ((Map)list.get(0)).get("GROUPID").toString();
    }

    @Override
    public List getTerminalsByGroupIdAsjdbc(String entGroupId) {
        String sql = "select name,phoneNumber,ptid,orglat,orglon from personalterm_info where groupId = ?";
        List list = jdbcTemplate.queryForList(sql, entGroupId);
        if (list.size() == 0) {
            return null;
        }
        return list;
    }

    @Override
    public Map selectByIdAsJdbc(String ptId) {
        String sql = "select orglat,orglon from personalterm_info where ptId = ?";
        List list = jdbcTemplate.queryForList(sql, ptId);
        if (list.size() == 0) {
            return null;
        }
        return (Map) list.get(0);
    }
}
