package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.CounselorDetail;
import com.leyuan.jiang.pojo.po.CounselorDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounselorDetailMapper {
    int countByExample(CounselorDetailExample example);

    int deleteByExample(CounselorDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CounselorDetail record);

    int insertSelective(CounselorDetail record);

    List<CounselorDetail> selectByExample(CounselorDetailExample example);

    CounselorDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CounselorDetail record, @Param("example") CounselorDetailExample example);

    int updateByExample(@Param("record") CounselorDetail record, @Param("example") CounselorDetailExample example);

    int updateByPrimaryKeySelective(CounselorDetail record);

    int updateByPrimaryKey(CounselorDetail record);
}