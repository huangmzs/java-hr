package com.java158.hrclient.mapper;

import com.java158.hr.entity.SalaryStandardDetails;
import com.java158.hr.entity.SalaryStandardDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SalaryStandardDetailsMapper {
    int countByExample(SalaryStandardDetailsExample example);

    int deleteByExample(SalaryStandardDetailsExample example);

    int deleteByPrimaryKey(Short sdtId);

    int insert(SalaryStandardDetails record);

    int insertSelective(SalaryStandardDetails record);

    List<SalaryStandardDetails> selectByExample(SalaryStandardDetailsExample example);

    SalaryStandardDetails selectByPrimaryKey(Short sdtId);

    int updateByExampleSelective(@Param("record") SalaryStandardDetails record, @Param("example") SalaryStandardDetailsExample example);

    int updateByExample(@Param("record") SalaryStandardDetails record, @Param("example") SalaryStandardDetailsExample example);

    int updateByPrimaryKeySelective(SalaryStandardDetails record);

    int updateByPrimaryKey(SalaryStandardDetails record);
}