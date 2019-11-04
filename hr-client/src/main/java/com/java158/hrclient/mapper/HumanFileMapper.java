package com.java158.hrclient.mapper;

import com.java158.hr.entity.HumanFile;
import com.java158.hr.entity.HumanFileExample;
import com.java158.hr.entity.HumanFileWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HumanFileMapper {
    int countByExample(HumanFileExample example);

    int deleteByExample(HumanFileExample example);

    int deleteByPrimaryKey(Short hufId);

    int insert(HumanFileWithBLOBs record);

    int insertSelective(HumanFileWithBLOBs record);

    List<HumanFileWithBLOBs> selectByExampleWithBLOBs(HumanFileExample example);

    List<HumanFile> selectByExample(HumanFileExample example);

    HumanFileWithBLOBs selectByPrimaryKey(Short hufId);

    int updateByExampleSelective(@Param("record") HumanFileWithBLOBs record, @Param("example") HumanFileExample example);

    int updateByExampleWithBLOBs(@Param("record") HumanFileWithBLOBs record, @Param("example") HumanFileExample example);

    int updateByExample(@Param("record") HumanFile record, @Param("example") HumanFileExample example);

    int updateByPrimaryKeySelective(HumanFileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HumanFileWithBLOBs record);

    int updateByPrimaryKey(HumanFile record);
}