package com.java158.hrclient.mapper;

import com.java158.hr.entity.ConfigMajor;
import com.java158.hr.entity.ConfigMajorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConfigMajorMapper {
    int countByExample(ConfigMajorExample example);

    int deleteByExample(ConfigMajorExample example);

    int deleteByPrimaryKey(Short makId);

    int insert(ConfigMajor record);

    int insertSelective(ConfigMajor record);

    List<ConfigMajor> selectByExample(ConfigMajorExample example);

    ConfigMajor selectByPrimaryKey(Short makId);

    int updateByExampleSelective(@Param("record") ConfigMajor record, @Param("example") ConfigMajorExample example);

    int updateByExample(@Param("record") ConfigMajor record, @Param("example") ConfigMajorExample example);

    int updateByPrimaryKeySelective(ConfigMajor record);

    int updateByPrimaryKey(ConfigMajor record);
}