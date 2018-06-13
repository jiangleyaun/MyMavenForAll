package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.PsychologicalCounseling;
import com.leyuan.jiang.pojo.po.PsychologicalCounselingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsychologicalCounselingMapper {
    int countByExample(PsychologicalCounselingExample example);

    int deleteByExample(PsychologicalCounselingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PsychologicalCounseling record);

    int insertSelective(PsychologicalCounseling record);

    List<PsychologicalCounseling> selectByExample(PsychologicalCounselingExample example);

    PsychologicalCounseling selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PsychologicalCounseling record, @Param("example") PsychologicalCounselingExample example);

    int updateByExample(@Param("record") PsychologicalCounseling record, @Param("example") PsychologicalCounselingExample example);

    int updateByPrimaryKeySelective(PsychologicalCounseling record);

    int updateByPrimaryKey(PsychologicalCounseling record);
}