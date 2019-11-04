package com.java158.hrclient.mapper;

import com.java158.hr.entity.ConfigFileThirdKind;
import com.java158.hr.entity.ConfigFileThirdKindExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConfigFileThirdKindMapper {
    int countByExample(ConfigFileThirdKindExample example);

    int deleteByExample(ConfigFileThirdKindExample example);

    int deleteByPrimaryKey(Short ftkId);

    int insert(ConfigFileThirdKind record);

    int insertSelective(ConfigFileThirdKind record);

    List<ConfigFileThirdKind> selectByExampleWithBLOBs(ConfigFileThirdKindExample example);

    List<ConfigFileThirdKind> selectByExample(ConfigFileThirdKindExample example);

    ConfigFileThirdKind selectByPrimaryKey(Short ftkId);

    int updateByExampleSelective(@Param("record") ConfigFileThirdKind record, @Param("example") ConfigFileThirdKindExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigFileThirdKind record, @Param("example") ConfigFileThirdKindExample example);

    int updateByExample(@Param("record") ConfigFileThirdKind record, @Param("example") ConfigFileThirdKindExample example);

    int updateByPrimaryKeySelective(ConfigFileThirdKind record);

    int updateByPrimaryKeyWithBLOBs(ConfigFileThirdKind record);

    int updateByPrimaryKey(ConfigFileThirdKind record);
}