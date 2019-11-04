package com.java158.hrclient.mapper;

import com.java158.hr.entity.Bonus;
import com.java158.hr.entity.BonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BonusMapper {
    int countByExample(BonusExample example);

    int deleteByExample(BonusExample example);

    int deleteByPrimaryKey(Integer bonId);

    int insert(Bonus record);

    int insertSelective(Bonus record);

    List<Bonus> selectByExampleWithBLOBs(BonusExample example);

    List<Bonus> selectByExample(BonusExample example);

    Bonus selectByPrimaryKey(Integer bonId);

    int updateByExampleSelective(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByExampleWithBLOBs(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByExample(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByPrimaryKeySelective(Bonus record);

    int updateByPrimaryKeyWithBLOBs(Bonus record);

    int updateByPrimaryKey(Bonus record);
}