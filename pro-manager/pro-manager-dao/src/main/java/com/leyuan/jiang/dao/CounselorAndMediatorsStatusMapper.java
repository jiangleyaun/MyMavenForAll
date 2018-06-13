package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.CounselorAndMediatorsStatus;
import com.leyuan.jiang.pojo.po.CounselorAndMediatorsStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounselorAndMediatorsStatusMapper {
    int countByExample(CounselorAndMediatorsStatusExample example);

    int deleteByExample(CounselorAndMediatorsStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CounselorAndMediatorsStatus record);

    int insertSelective(CounselorAndMediatorsStatus record);

    List<CounselorAndMediatorsStatus> selectByExample(CounselorAndMediatorsStatusExample example);

    CounselorAndMediatorsStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CounselorAndMediatorsStatus record, @Param("example") CounselorAndMediatorsStatusExample example);

    int updateByExample(@Param("record") CounselorAndMediatorsStatus record, @Param("example") CounselorAndMediatorsStatusExample example);

    int updateByPrimaryKeySelective(CounselorAndMediatorsStatus record);

    int updateByPrimaryKey(CounselorAndMediatorsStatus record);
}