package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.PsyProgress;
import com.leyuan.jiang.pojo.po.PsyProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsyProgressMapper {
    int countByExample(PsyProgressExample example);

    int deleteByExample(PsyProgressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PsyProgress record);

    int insertSelective(PsyProgress record);

    List<PsyProgress> selectByExample(PsyProgressExample example);

    PsyProgress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PsyProgress record, @Param("example") PsyProgressExample example);

    int updateByExample(@Param("record") PsyProgress record, @Param("example") PsyProgressExample example);

    int updateByPrimaryKeySelective(PsyProgress record);

    int updateByPrimaryKey(PsyProgress record);
}