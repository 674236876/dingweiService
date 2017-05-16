package com.myd.web.dao;

import com.myd.core.generic.GenericDao;
import com.myd.web.model.PoiInfo;
import com.myd.web.model.PoiInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoiInfoMapper extends GenericDao<PoiInfo,String>{
    int countByExample(PoiInfoExample example);

    int deleteByExample(PoiInfoExample example);

    int insert(PoiInfo record);

    int insertSelective(PoiInfo record);

    List<PoiInfo> selectByExample(PoiInfoExample example);

    int updateByExampleSelective(@Param("record") PoiInfo record, @Param("example") PoiInfoExample example);

    int updateByExample(@Param("record") PoiInfo record, @Param("example") PoiInfoExample example);
}