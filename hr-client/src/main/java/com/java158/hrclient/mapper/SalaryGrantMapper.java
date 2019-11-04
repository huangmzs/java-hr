package com.java158.hrclient.mapper;

import com.java158.hr.entity.SalaryGrant;
import com.java158.hr.entity.SalaryGrantExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SalaryGrantMapper {
    int countByExample(SalaryGrantExample example);

    int deleteByExample(SalaryGrantExample example);

    int deleteByPrimaryKey(Short sgrId);

    int insert(SalaryGrant record);

    int insertSelective(SalaryGrant record);

    List<SalaryGrant> selectByExample(SalaryGrantExample example);

    SalaryGrant selectByPrimaryKey(Short sgrId);

    int updateByExampleSelective(@Param("record") SalaryGrant record, @Param("example") SalaryGrantExample example);

    int updateByExample(@Param("record") SalaryGrant record, @Param("example") SalaryGrantExample example);

    int updateByPrimaryKeySelective(SalaryGrant record);

    int updateByPrimaryKey(SalaryGrant record);
}