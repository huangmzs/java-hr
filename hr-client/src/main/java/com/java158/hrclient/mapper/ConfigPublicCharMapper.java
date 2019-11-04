package com.java158.hrclient.mapper;

import com.java158.hr.entity.ConfigPublicChar;
import com.java158.hr.entity.ConfigPublicCharExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConfigPublicCharMapper {
    int countByExample(ConfigPublicCharExample example);

    int deleteByExample(ConfigPublicCharExample example);

    int deleteByPrimaryKey(Short pbcId);

    int insert(ConfigPublicChar record);

    int insertSelective(ConfigPublicChar record);

    List<ConfigPublicChar> selectByExample(ConfigPublicCharExample example);

    ConfigPublicChar selectByPrimaryKey(Short pbcId);

    int updateByExampleSelective(@Param("record") ConfigPublicChar record, @Param("example") ConfigPublicCharExample example);

    int updateByExample(@Param("record") ConfigPublicChar record, @Param("example") ConfigPublicCharExample example);

    int updateByPrimaryKeySelective(ConfigPublicChar record);

    int updateByPrimaryKey(ConfigPublicChar record);
}