package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.SanctuaryApplicationProgress;
import com.leyuan.jiang.pojo.po.SanctuaryApplicationProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SanctuaryApplicationProgressMapper {
    int countByExample(SanctuaryApplicationProgressExample example);

    int deleteByExample(SanctuaryApplicationProgressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SanctuaryApplicationProgress record);

    int insertSelective(SanctuaryApplicationProgress record);

    List<SanctuaryApplicationProgress> selectByExample(SanctuaryApplicationProgressExample example);

    SanctuaryApplicationProgress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SanctuaryApplicationProgress record, @Param("example") SanctuaryApplicationProgressExample example);

    int updateByExample(@Param("record") SanctuaryApplicationProgress record, @Param("example") SanctuaryApplicationProgressExample example);

    int updateByPrimaryKeySelective(SanctuaryApplicationProgress record);

    int updateByPrimaryKey(SanctuaryApplicationProgress record);
}