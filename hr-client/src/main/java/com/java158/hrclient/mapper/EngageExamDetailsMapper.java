package com.java158.hrclient.mapper;

import com.java158.hr.entity.EngageExamDetails;
import com.java158.hr.entity.EngageExamDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EngageExamDetailsMapper {
    int countByExample(EngageExamDetailsExample example);

    int deleteByExample(EngageExamDetailsExample example);

    int deleteByPrimaryKey(Short exdId);

    int insert(EngageExamDetails record);

    int insertSelective(EngageExamDetails record);

    List<EngageExamDetails> selectByExample(EngageExamDetailsExample example);

    EngageExamDetails selectByPrimaryKey(Short exdId);

    int updateByExampleSelective(@Param("record") EngageExamDetails record, @Param("example") EngageExamDetailsExample example);

    int updateByExample(@Param("record") EngageExamDetails record, @Param("example") EngageExamDetailsExample example);

    int updateByPrimaryKeySelective(EngageExamDetails record);

    int updateByPrimaryKey(EngageExamDetails record);
}