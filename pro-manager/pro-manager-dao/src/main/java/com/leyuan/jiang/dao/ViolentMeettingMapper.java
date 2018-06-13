package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentMeetting;
import com.leyuan.jiang.pojo.po.ViolentMeettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentMeettingMapper {
    int countByExample(ViolentMeettingExample example);

    int deleteByExample(ViolentMeettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentMeetting record);

    int insertSelective(ViolentMeetting record);

    List<ViolentMeetting> selectByExample(ViolentMeettingExample example);

    ViolentMeetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentMeetting record, @Param("example") ViolentMeettingExample example);

    int updateByExample(@Param("record") ViolentMeetting record, @Param("example") ViolentMeettingExample example);

    int updateByPrimaryKeySelective(ViolentMeetting record);

    int updateByPrimaryKey(ViolentMeetting record);
}