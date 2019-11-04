package com.java158.hrclient.mapper;

import com.java158.hr.entity.MajorChange;
import com.java158.hr.entity.MajorChangeExample;
import com.java158.hr.entity.MajorChangeWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MajorChangeMapper {
    int countByExample(MajorChangeExample example);

    int deleteByExample(MajorChangeExample example);

    int deleteByPrimaryKey(Short mchId);

    int insert(MajorChangeWithBLOBs record);

    int insertSelective(MajorChangeWithBLOBs record);

    List<MajorChangeWithBLOBs> selectByExampleWithBLOBs(MajorChangeExample example);

    List<MajorChange> selectByExample(MajorChangeExample example);

    MajorChangeWithBLOBs selectByPrimaryKey(Short mchId);

    int updateByExampleSelective(@Param("record") MajorChangeWithBLOBs record, @Param("example") MajorChangeExample example);

    int updateByExampleWithBLOBs(@Param("record") MajorChangeWithBLOBs record, @Param("example") MajorChangeExample example);

    int updateByExample(@Param("record") MajorChange record, @Param("example") MajorChangeExample example);

    int updateByPrimaryKeySelective(MajorChangeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MajorChangeWithBLOBs record);

    int updateByPrimaryKey(MajorChange record);
}