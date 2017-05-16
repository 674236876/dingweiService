package com.myd.web.dao;

import com.myd.core.generic.GenericDao;
import com.myd.web.model.EntgroupInfo;
import com.myd.web.model.EntgroupInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntgroupInfoMapper extends GenericDao<EntgroupInfo,Long>{
    int countByExample(EntgroupInfoExample example);

    int deleteByExample(EntgroupInfoExample example);

    int insert(EntgroupInfo record);

    int insertSelective(EntgroupInfo record);

    List<EntgroupInfo> selectByExample(EntgroupInfoExample example);

    int updateByExampleSelective(@Param("record") EntgroupInfo record, @Param("example") EntgroupInfoExample example);

    int updateByExample(@Param("record") EntgroupInfo record, @Param("example") EntgroupInfoExample example);

    List<EntgroupInfo> selectListByEntId(Long entid);
}