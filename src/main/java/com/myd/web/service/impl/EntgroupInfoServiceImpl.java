package com.myd.web.service.impl;

import com.myd.core.generic.GenericDao;
import com.myd.core.generic.GenericServiceImpl;
import com.myd.utils.JdbcTemplateUtils;
import com.myd.web.dao.EntgroupInfoMapper;
import com.myd.web.model.EntgroupInfo;
import com.myd.web.service.EntgroupInfoService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhugp on 2017/3/31.
 */
@Service
public class EntgroupInfoServiceImpl extends GenericServiceImpl<EntgroupInfo,Long> implements EntgroupInfoService{

    @Resource
    private EntgroupInfoMapper entgroupInfoMapper;

    private JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();


    @Override
    public GenericDao<EntgroupInfo, Long> getDao() {
        return entgroupInfoMapper;
    }

    @Override
    public List<EntgroupInfo> selectListByEntId(Long entid) {
        return entgroupInfoMapper.selectListByEntId(entid);
    }

    @Override
    public List selectListByEntIdAsJdbc(String entid) {
        String sql = "select groupid,name from entgroup_info where entid = ?";
        List list = jdbcTemplate.queryForList(sql,entid);
        if (list.size() == 0) {
            return null;
        }
        return list;
    }

    @Override
    public String getGroupNameByIdAsJdbc(String groupId) {
        String sql = "select name from entgroup_info where groupid = ?";
        List list = jdbcTemplate.queryForList(sql, groupId);
        if (list.size() == 0) {
            return "";
        }
        return ((Map) list.get(0)).get("NAME").toString();
    }
}
