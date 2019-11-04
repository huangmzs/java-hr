package com.java158.hrclient.mapper;

import com.java158.hr.entity.PRoleTable;
import com.java158.hr.entity.PRoleTableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PRoleTableMapper {
    int countByExample(PRoleTableExample example);

    int deleteByExample(PRoleTableExample example);

    int deleteByPrimaryKey(Integer prId);

    int insert(PRoleTable record);

    int insertSelective(PRoleTable record);

    List<PRoleTable> selectByExample(PRoleTableExample example);

    PRoleTable selectByPrimaryKey(Integer prId);

    int updateByExampleSelective(@Param("record") PRoleTable record, @Param("example") PRoleTableExample example);

    int updateByExample(@Param("record") PRoleTable record, @Param("example") PRoleTableExample example);

    int updateByPrimaryKeySelective(PRoleTable record);

    int updateByPrimaryKey(PRoleTable record);
}