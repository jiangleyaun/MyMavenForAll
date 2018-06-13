package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.LawCaseProgress;
import com.leyuan.jiang.pojo.po.LawCaseProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LawCaseProgressMapper {
    int countByExample(LawCaseProgressExample example);

    int deleteByExample(LawCaseProgressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LawCaseProgress record);

    int insertSelective(LawCaseProgress record);

    List<LawCaseProgress> selectByExample(LawCaseProgressExample example);

    LawCaseProgress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LawCaseProgress record, @Param("example") LawCaseProgressExample example);

    int updateByExample(@Param("record") LawCaseProgress record, @Param("example") LawCaseProgressExample example);

    int updateByPrimaryKeySelective(LawCaseProgress record);

    int updateByPrimaryKey(LawCaseProgress record);
}