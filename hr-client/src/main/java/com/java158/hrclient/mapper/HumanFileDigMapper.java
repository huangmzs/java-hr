package com.java158.hrclient.mapper;

import com.java158.hr.entity.HumanFileDig;
import com.java158.hr.entity.HumanFileDigExample;
import com.java158.hr.entity.HumanFileDigWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HumanFileDigMapper {
    int countByExample(HumanFileDigExample example);

    int deleteByExample(HumanFileDigExample example);

    int deleteByPrimaryKey(Short hfdId);

    int insert(HumanFileDigWithBLOBs record);

    int insertSelective(HumanFileDigWithBLOBs record);

    List<HumanFileDigWithBLOBs> selectByExampleWithBLOBs(HumanFileDigExample example);

    List<HumanFileDig> selectByExample(HumanFileDigExample example);

    HumanFileDigWithBLOBs selectByPrimaryKey(Short hfdId);

    int updateByExampleSelective(@Param("record") HumanFileDigWithBLOBs record, @Param("example") HumanFileDigExample example);

    int updateByExampleWithBLOBs(@Param("record") HumanFileDigWithBLOBs record, @Param("example") HumanFileDigExample example);

    int updateByExample(@Param("record") HumanFileDig record, @Param("example") HumanFileDigExample example);

    int updateByPrimaryKeySelective(HumanFileDigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HumanFileDigWithBLOBs record);

    int updateByPrimaryKey(HumanFileDig record);
}