package com.myd.web.dao;

import com.myd.core.generic.GenericDao;
import com.myd.web.model.ChatusergrpMap;
import com.myd.web.model.ChatusergrpMapExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatusergrpMapMapper extends GenericDao<ChatusergrpMap, String> {

    int countByExample(ChatusergrpMapExample example);

    int deleteByExample(ChatusergrpMapExample example);

    int insert(ChatusergrpMap record);

    int insertSelective(ChatusergrpMap record);

    List<ChatusergrpMap> selectByExample(ChatusergrpMapExample example);

    int updateByExampleSelective(@Param("record") ChatusergrpMap record, @Param("example") ChatusergrpMapExample example);

    int updateByExample(@Param("record") ChatusergrpMap record, @Param("example") ChatusergrpMapExample example);

    //通过电话号码查询数据接口，根据群组名称去重
    List<String> selectByPhoneNumDistinct(@Param("phoneNum") String phoneNum);

    //通过
    List<String> selectByGroupDistinct(@Param("groupName") String groupName);
}