package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.PspoProgress;
import com.leyuan.jiang.pojo.po.PspoProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PspoProgressMapper {
    int countByExample(PspoProgressExample example);

    int deleteByExample(PspoProgressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PspoProgress record);

    int insertSelective(PspoProgress record);

    List<PspoProgress> selectByExample(PspoProgressExample example);

    PspoProgress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PspoProgress record, @Param("example") PspoProgressExample example);

    int updateByExample(@Param("record") PspoProgress record, @Param("example") PspoProgressExample example);

    int updateByPrimaryKeySelective(PspoProgress record);

    int updateByPrimaryKey(PspoProgress record);
}