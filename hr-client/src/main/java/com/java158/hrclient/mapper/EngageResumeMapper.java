package com.java158.hrclient.mapper;

import com.java158.hr.entity.EngageResume;
import com.java158.hr.entity.EngageResumeExample;
import com.java158.hr.entity.EngageResumeWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EngageResumeMapper {
    int countByExample(EngageResumeExample example);

    int deleteByExample(EngageResumeExample example);

    int deleteByPrimaryKey(Short resId);

    int insert(EngageResumeWithBLOBs record);

    int insertSelective(EngageResumeWithBLOBs record);

    List<EngageResumeWithBLOBs> selectByExampleWithBLOBs(EngageResumeExample example);

    List<EngageResume> selectByExample(EngageResumeExample example);

    EngageResumeWithBLOBs selectByPrimaryKey(Short resId);

    int updateByExampleSelective(@Param("record") EngageResumeWithBLOBs record, @Param("example") EngageResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") EngageResumeWithBLOBs record, @Param("example") EngageResumeExample example);

    int updateByExample(@Param("record") EngageResume record, @Param("example") EngageResumeExample example);

    int updateByPrimaryKeySelective(EngageResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageResumeWithBLOBs record);

    int updateByPrimaryKey(EngageResume record);
}