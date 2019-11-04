package com.java158.hrclient.mapper;

import com.java158.hr.entity.ConfigFileFirstKind;
import com.java158.hr.entity.ConfigFileFirstKindExample;
import com.java158.hr.entity.ConfigFileFirstKindWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConfigFileFirstKindMapper {
    int countByExample(ConfigFileFirstKindExample example);

    int deleteByExample(ConfigFileFirstKindExample example);

    int deleteByPrimaryKey(Short ffkId);

    int insert(ConfigFileFirstKindWithBLOBs record);

    int insertSelective(ConfigFileFirstKindWithBLOBs record);

    List<ConfigFileFirstKindWithBLOBs> selectByExampleWithBLOBs(ConfigFileFirstKindExample example);

    List<ConfigFileFirstKind> selectByExample(ConfigFileFirstKindExample example);

    ConfigFileFirstKindWithBLOBs selectByPrimaryKey(Short ffkId);

    int updateByExampleSelective(@Param("record") ConfigFileFirstKindWithBLOBs record, @Param("example") ConfigFileFirstKindExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigFileFirstKindWithBLOBs record, @Param("example") ConfigFileFirstKindExample example);

    int updateByExample(@Param("record") ConfigFileFirstKind record, @Param("example") ConfigFileFirstKindExample example);

    int updateByPrimaryKeySelective(ConfigFileFirstKindWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ConfigFileFirstKindWithBLOBs record);

    int updateByPrimaryKey(ConfigFileFirstKind record);
}