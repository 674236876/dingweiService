package com.myd.web.dao;

import com.myd.core.generic.GenericDao;
import com.myd.web.model.Imagereport;
import com.myd.web.model.ImagereportExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagereportMapper extends GenericDao<Imagereport,Integer>{
    int countByExample(ImagereportExample example);

    int deleteByExample(ImagereportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Imagereport record);

    int insertSelective(Imagereport record);

    List<Imagereport> selectByExample(ImagereportExample example);

    Imagereport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Imagereport record, @Param("example") ImagereportExample example);

    int updateByExample(@Param("record") Imagereport record, @Param("example") ImagereportExample example);

    int updateByPrimaryKeySelective(Imagereport record);

    int updateByPrimaryKey(Imagereport record);

}