package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.PsyReport;
import com.leyuan.jiang.pojo.po.PsyReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsyReportMapper {
    int countByExample(PsyReportExample example);

    int deleteByExample(PsyReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PsyReport record);

    int insertSelective(PsyReport record);

    List<PsyReport> selectByExample(PsyReportExample example);

    PsyReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PsyReport record, @Param("example") PsyReportExample example);

    int updateByExample(@Param("record") PsyReport record, @Param("example") PsyReportExample example);

    int updateByPrimaryKeySelective(PsyReport record);

    int updateByPrimaryKey(PsyReport record);
}