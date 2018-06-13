package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.CounselorScore;
import com.leyuan.jiang.pojo.po.CounselorScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounselorScoreMapper {
    int countByExample(CounselorScoreExample example);

    int deleteByExample(CounselorScoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CounselorScore record);

    int insertSelective(CounselorScore record);

    List<CounselorScore> selectByExample(CounselorScoreExample example);

    CounselorScore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CounselorScore record, @Param("example") CounselorScoreExample example);

    int updateByExample(@Param("record") CounselorScore record, @Param("example") CounselorScoreExample example);

    int updateByPrimaryKeySelective(CounselorScore record);

    int updateByPrimaryKey(CounselorScore record);
}