package com.java158.hrclient.mapper;

import com.java158.hr.entity.SalaryGrantDetails;
import com.java158.hr.entity.SalaryGrantDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SalaryGrantDetailsMapper {
    int countByExample(SalaryGrantDetailsExample example);

    int deleteByExample(SalaryGrantDetailsExample example);

    int deleteByPrimaryKey(Short grdId);

    int insert(SalaryGrantDetails record);

    int insertSelective(SalaryGrantDetails record);

    List<SalaryGrantDetails> selectByExample(SalaryGrantDetailsExample example);

    SalaryGrantDetails selectByPrimaryKey(Short grdId);

    int updateByExampleSelective(@Param("record") SalaryGrantDetails record, @Param("example") SalaryGrantDetailsExample example);

    int updateByExample(@Param("record") SalaryGrantDetails record, @Param("example") SalaryGrantDetailsExample example);

    int updateByPrimaryKeySelective(SalaryGrantDetails record);

    int updateByPrimaryKey(SalaryGrantDetails record);
}