package com.java158.hrclient.mapper;

import com.java158.hr.entity.SalaryStandard;
import com.java158.hr.entity.SalaryStandardExample;
import com.java158.hr.entity.SalaryStandardWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SalaryStandardMapper {
    int countByExample(SalaryStandardExample example);

    int deleteByExample(SalaryStandardExample example);

    int deleteByPrimaryKey(Short ssdId);

    int insert(SalaryStandardWithBLOBs record);

    int insertSelective(SalaryStandardWithBLOBs record);

    List<SalaryStandardWithBLOBs> selectByExampleWithBLOBs(SalaryStandardExample example);

    List<SalaryStandard> selectByExample(SalaryStandardExample example);

    SalaryStandardWithBLOBs selectByPrimaryKey(Short ssdId);

    int updateByExampleSelective(@Param("record") SalaryStandardWithBLOBs record, @Param("example") SalaryStandardExample example);

    int updateByExampleWithBLOBs(@Param("record") SalaryStandardWithBLOBs record, @Param("example") SalaryStandardExample example);

    int updateByExample(@Param("record") SalaryStandard record, @Param("example") SalaryStandardExample example);

    int updateByPrimaryKeySelective(SalaryStandardWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SalaryStandardWithBLOBs record);

    int updateByPrimaryKey(SalaryStandard record);
}