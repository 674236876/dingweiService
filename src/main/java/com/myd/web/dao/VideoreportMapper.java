package com.myd.web.dao;

import com.myd.core.generic.GenericDao;
import com.myd.web.model.Videoreport;
import com.myd.web.model.VideoreportExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoreportMapper extends GenericDao<Videoreport,Integer> {
    int countByExample(VideoreportExample example);

    int deleteByExample(VideoreportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Videoreport record);

    int insertSelective(Videoreport record);

    List<Videoreport> selectByExample(VideoreportExample example);

    Videoreport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Videoreport record, @Param("example") VideoreportExample example);

    int updateByExample(@Param("record") Videoreport record, @Param("example") VideoreportExample example);

    int updateByPrimaryKeySelective(Videoreport record);

    int updateByPrimaryKey(Videoreport record);
}