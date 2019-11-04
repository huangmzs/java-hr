package com.java158.hrclient.mapper;

import com.java158.hr.entity.EngageInterview;
import com.java158.hr.entity.EngageInterviewExample;
import com.java158.hr.entity.EngageInterviewWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EngageInterviewMapper {
    int countByExample(EngageInterviewExample example);

    int deleteByExample(EngageInterviewExample example);

    int deleteByPrimaryKey(Short einId);

    int insert(EngageInterviewWithBLOBs record);

    int insertSelective(EngageInterviewWithBLOBs record);

    List<EngageInterviewWithBLOBs> selectByExampleWithBLOBs(EngageInterviewExample example);

    List<EngageInterview> selectByExample(EngageInterviewExample example);

    EngageInterviewWithBLOBs selectByPrimaryKey(Short einId);

    int updateByExampleSelective(@Param("record") EngageInterviewWithBLOBs record, @Param("example") EngageInterviewExample example);

    int updateByExampleWithBLOBs(@Param("record") EngageInterviewWithBLOBs record, @Param("example") EngageInterviewExample example);

    int updateByExample(@Param("record") EngageInterview record, @Param("example") EngageInterviewExample example);

    int updateByPrimaryKeySelective(EngageInterviewWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageInterviewWithBLOBs record);

    int updateByPrimaryKey(EngageInterview record);
}