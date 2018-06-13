package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.SanctuaryProgress;
import com.leyuan.jiang.pojo.po.SanctuaryProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SanctuaryProgressMapper {
    int countByExample(SanctuaryProgressExample example);

    int deleteByExample(SanctuaryProgressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SanctuaryProgress record);

    int insertSelective(SanctuaryProgress record);

    List<SanctuaryProgress> selectByExample(SanctuaryProgressExample example);

    SanctuaryProgress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SanctuaryProgress record, @Param("example") SanctuaryProgressExample example);

    int updateByExample(@Param("record") SanctuaryProgress record, @Param("example") SanctuaryProgressExample example);

    int updateByPrimaryKeySelective(SanctuaryProgress record);

    int updateByPrimaryKey(SanctuaryProgress record);
}