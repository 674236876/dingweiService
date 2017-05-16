package com.myd.web.service.impl;

import com.myd.core.generic.GenericDao;
import com.myd.core.generic.GenericServiceImpl;
import com.myd.web.dao.ChatusergrpMapMapper;
import com.myd.web.model.ChatusergrpMap;
import com.myd.web.model.ChatusergrpMapExample;
import com.myd.web.service.ChatUserGrpMapService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhugp on 2017/3/29.
 */
@Service
public class ChatUserGrpMapServiceImpl extends GenericServiceImpl<ChatusergrpMap,String> implements ChatUserGrpMapService {

    @Resource
    private ChatusergrpMapMapper chatusergrpMapMapper;

    @Override
    public GenericDao<ChatusergrpMap, String> getDao() {
        return chatusergrpMapMapper;
    }

    @Override
    public List<ChatusergrpMap> selectByPhoneNum(String phoneNum) {
        ChatusergrpMapExample example = new ChatusergrpMapExample();
        example.setDistinct(false);
        example.createCriteria().andPhonenumberEqualTo(phoneNum);
        return chatusergrpMapMapper.selectByExample(example);
    }

    @Override
    public List<String> selectByPhoneNumDistinct(String phoneNum) {
        return chatusergrpMapMapper.selectByPhoneNumDistinct(phoneNum);
    }

    @Override
    public List<String> selectByGroupDistinct(String groupName) {
        return chatusergrpMapMapper.selectByGroupDistinct(groupName);
    }

    @Override
    public int insert(ChatusergrpMap model) {
        return chatusergrpMapMapper.insertSelective(model);
    }

    @Override
    public int update(ChatusergrpMap model) {
        return chatusergrpMapMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(String id) {
        return chatusergrpMapMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ChatusergrpMap selectById(String id) {
        return chatusergrpMapMapper.selectByPrimaryKey(id);
    }

    @Override
    public ChatusergrpMap selectOne() {
        return null;
    }

    @Override
    public List<ChatusergrpMap> selectList() {
        ChatusergrpMapExample example = new ChatusergrpMapExample();
        example.createCriteria();
        return chatusergrpMapMapper.selectByExample(example);
    }
}
