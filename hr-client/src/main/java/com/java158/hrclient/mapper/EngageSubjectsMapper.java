package com.java158.hrclient.mapper;

import com.java158.hr.entity.EngageSubjects;
import com.java158.hr.entity.EngageSubjectsExample;
import com.java158.hr.entity.EngageSubjectsWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EngageSubjectsMapper {
    int countByExample(EngageSubjectsExample example);

    int deleteByExample(EngageSubjectsExample example);

    int deleteByPrimaryKey(Short subId);

    int insert(EngageSubjectsWithBLOBs record);

    int insertSelective(EngageSubjectsWithBLOBs record);

    List<EngageSubjectsWithBLOBs> selectByExampleWithBLOBs(EngageSubjectsExample example);

    List<EngageSubjects> selectByExample(EngageSubjectsExample example);

    EngageSubjectsWithBLOBs selectByPrimaryKey(Short subId);

    int updateByExampleSelective(@Param("record") EngageSubjectsWithBLOBs record, @Param("example") EngageSubjectsExample example);

    int updateByExampleWithBLOBs(@Param("record") EngageSubjectsWithBLOBs record, @Param("example") EngageSubjectsExample example);

    int updateByExample(@Param("record") EngageSubjects record, @Param("example") EngageSubjectsExample example);

    int updateByPrimaryKeySelective(EngageSubjectsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageSubjectsWithBLOBs record);

    int updateByPrimaryKey(EngageSubjects record);
}