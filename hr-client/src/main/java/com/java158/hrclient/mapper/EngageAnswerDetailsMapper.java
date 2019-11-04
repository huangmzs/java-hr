package com.java158.hrclient.mapper;

import com.java158.hr.entity.EngageAnswerDetails;
import com.java158.hr.entity.EngageAnswerDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EngageAnswerDetailsMapper {
    int countByExample(EngageAnswerDetailsExample example);

    int deleteByExample(EngageAnswerDetailsExample example);

    int deleteByPrimaryKey(Short andId);

    int insert(EngageAnswerDetails record);

    int insertSelective(EngageAnswerDetails record);

    List<EngageAnswerDetails> selectByExample(EngageAnswerDetailsExample example);

    EngageAnswerDetails selectByPrimaryKey(Short andId);

    int updateByExampleSelective(@Param("record") EngageAnswerDetails record, @Param("example") EngageAnswerDetailsExample example);

    int updateByExample(@Param("record") EngageAnswerDetails record, @Param("example") EngageAnswerDetailsExample example);

    int updateByPrimaryKeySelective(EngageAnswerDetails record);

    int updateByPrimaryKey(EngageAnswerDetails record);
}