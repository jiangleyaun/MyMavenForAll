package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.CounselorAndMediators;
import com.leyuan.jiang.pojo.po.CounselorAndMediatorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounselorAndMediatorsMapper {
    int countByExample(CounselorAndMediatorsExample example);

    int deleteByExample(CounselorAndMediatorsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CounselorAndMediators record);

    int insertSelective(CounselorAndMediators record);

    List<CounselorAndMediators> selectByExample(CounselorAndMediatorsExample example);

    CounselorAndMediators selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CounselorAndMediators record, @Param("example") CounselorAndMediatorsExample example);

    int updateByExample(@Param("record") CounselorAndMediators record, @Param("example") CounselorAndMediatorsExample example);

    int updateByPrimaryKeySelective(CounselorAndMediators record);

    int updateByPrimaryKey(CounselorAndMediators record);
}