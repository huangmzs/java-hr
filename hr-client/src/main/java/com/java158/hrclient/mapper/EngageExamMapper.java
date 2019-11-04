package com.java158.hrclient.mapper;

import com.java158.hr.entity.EngageExam;
import com.java158.hr.entity.EngageExamExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EngageExamMapper {
    int countByExample(EngageExamExample example);

    int deleteByExample(EngageExamExample example);

    int deleteByPrimaryKey(Short exaId);

    int insert(EngageExam record);

    int insertSelective(EngageExam record);

    List<EngageExam> selectByExample(EngageExamExample example);

    EngageExam selectByPrimaryKey(Short exaId);

    int updateByExampleSelective(@Param("record") EngageExam record, @Param("example") EngageExamExample example);

    int updateByExample(@Param("record") EngageExam record, @Param("example") EngageExamExample example);

    int updateByPrimaryKeySelective(EngageExam record);

    int updateByPrimaryKey(EngageExam record);
}