package com.java158.hrclient.mapper;

import com.java158.hr.entity.ConfigPrimaryKey;
import com.java158.hr.entity.ConfigPrimaryKeyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConfigPrimaryKeyMapper {
    int countByExample(ConfigPrimaryKeyExample example);

    int deleteByExample(ConfigPrimaryKeyExample example);

    int deleteByPrimaryKey(Short prkId);

    int insert(ConfigPrimaryKey record);

    int insertSelective(ConfigPrimaryKey record);

    List<ConfigPrimaryKey> selectByExample(ConfigPrimaryKeyExample example);

    ConfigPrimaryKey selectByPrimaryKey(Short prkId);

    int updateByExampleSelective(@Param("record") ConfigPrimaryKey record, @Param("example") ConfigPrimaryKeyExample example);

    int updateByExample(@Param("record") ConfigPrimaryKey record, @Param("example") ConfigPrimaryKeyExample example);

    int updateByPrimaryKeySelective(ConfigPrimaryKey record);

    int updateByPrimaryKey(ConfigPrimaryKey record);
}