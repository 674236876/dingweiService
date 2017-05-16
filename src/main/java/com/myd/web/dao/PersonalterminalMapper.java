package com.myd.web.dao;

import com.myd.core.generic.GenericDao;
import com.myd.web.model.PersonalTerminal;
import com.myd.web.model.PersonalterminalExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalterminalMapper extends GenericDao<PersonalTerminal, Long> {
    int countByExample(PersonalterminalExample example);

    int deleteByExample(PersonalterminalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PersonalTerminal record);

    int insertSelective(PersonalTerminal record);

    List<PersonalTerminal> selectByExample(PersonalterminalExample example);

    PersonalTerminal selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PersonalTerminal record, @Param("example") PersonalterminalExample example);

    int updateByExample(@Param("record") PersonalTerminal record, @Param("example") PersonalterminalExample example);

    int updateByPrimaryKeySelective(PersonalTerminal record);

    int updateByPrimaryKey(PersonalTerminal record);

    String getEntIdByptId(Long ptId);

}