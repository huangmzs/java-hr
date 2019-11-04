package com.java158.hrclient.mapper;

import com.java158.hr.entity.ConfigFileSecondKind;
import com.java158.hr.entity.ConfigFileSecondKindExample;
import com.java158.hr.entity.ConfigFileSecondKindWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigFileSecondKindMapper {
    int countByExample(ConfigFileSecondKindExample example);

    int deleteByExample(ConfigFileSecondKindExample example);

    int deleteByPrimaryKey(Short fskId);

    int insert(ConfigFileSecondKindWithBLOBs record);

    int insertSelective(ConfigFileSecondKindWithBLOBs record);

    List<ConfigFileSecondKindWithBLOBs> selectByExampleWithBLOBs(ConfigFileSecondKindExample example);

    List<ConfigFileSecondKind> selectByExample(ConfigFileSecondKindExample example);

    ConfigFileSecondKindWithBLOBs selectByPrimaryKey(Short fskId);

    int updateByExampleSelective(@Param("record") ConfigFileSecondKindWithBLOBs record, @Param("example") ConfigFileSecondKindExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigFileSecondKindWithBLOBs record, @Param("example") ConfigFileSecondKindExample example);

    int updateByExample(@Param("record") ConfigFileSecondKind record, @Param("example") ConfigFileSecondKindExample example);

    int updateByPrimaryKeySelective(ConfigFileSecondKindWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ConfigFileSecondKindWithBLOBs record);

    int updateByPrimaryKey(ConfigFileSecondKind record);
}