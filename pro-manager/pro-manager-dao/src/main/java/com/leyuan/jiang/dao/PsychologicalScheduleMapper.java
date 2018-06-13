package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.PsychologicalSchedule;
import com.leyuan.jiang.pojo.po.PsychologicalScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsychologicalScheduleMapper {
    int countByExample(PsychologicalScheduleExample example);

    int deleteByExample(PsychologicalScheduleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PsychologicalSchedule record);

    int insertSelective(PsychologicalSchedule record);

    List<PsychologicalSchedule> selectByExample(PsychologicalScheduleExample example);

    PsychologicalSchedule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PsychologicalSchedule record, @Param("example") PsychologicalScheduleExample example);

    int updateByExample(@Param("record") PsychologicalSchedule record, @Param("example") PsychologicalScheduleExample example);

    int updateByPrimaryKeySelective(PsychologicalSchedule record);

    int updateByPrimaryKey(PsychologicalSchedule record);
}