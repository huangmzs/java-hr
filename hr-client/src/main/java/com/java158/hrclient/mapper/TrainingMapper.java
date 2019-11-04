package com.java158.hrclient.mapper;

import com.java158.hr.entity.Training;
import com.java158.hr.entity.TrainingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TrainingMapper {
    int countByExample(TrainingExample example);

    int deleteByExample(TrainingExample example);

    int deleteByPrimaryKey(Short traId);

    int insert(Training record);

    int insertSelective(Training record);

    List<Training> selectByExampleWithBLOBs(TrainingExample example);

    List<Training> selectByExample(TrainingExample example);

    Training selectByPrimaryKey(Short traId);

    int updateByExampleSelective(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExampleWithBLOBs(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExample(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKeyWithBLOBs(Training record);

    int updateByPrimaryKey(Training record);
}