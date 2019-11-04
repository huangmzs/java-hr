package com.java158.hrclient.mapper;

import com.java158.hr.entity.ConfigQuestionFirstKind;
import com.java158.hr.entity.ConfigQuestionFirstKindExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConfigQuestionFirstKindMapper {
    int countByExample(ConfigQuestionFirstKindExample example);

    int deleteByExample(ConfigQuestionFirstKindExample example);

    int deleteByPrimaryKey(Short qfkId);

    int insert(ConfigQuestionFirstKind record);

    int insertSelective(ConfigQuestionFirstKind record);

    List<ConfigQuestionFirstKind> selectByExample(ConfigQuestionFirstKindExample example);

    ConfigQuestionFirstKind selectByPrimaryKey(Short qfkId);

    int updateByExampleSelective(@Param("record") ConfigQuestionFirstKind record, @Param("example") ConfigQuestionFirstKindExample example);

    int updateByExample(@Param("record") ConfigQuestionFirstKind record, @Param("example") ConfigQuestionFirstKindExample example);

    int updateByPrimaryKeySelective(ConfigQuestionFirstKind record);

    int updateByPrimaryKey(ConfigQuestionFirstKind record);
}