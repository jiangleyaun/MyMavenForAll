package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.Counselor;
import com.leyuan.jiang.pojo.po.CounselorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounselorMapper {
    int countByExample(CounselorExample example);

    int deleteByExample(CounselorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Counselor record);

    int insertSelective(Counselor record);

    List<Counselor> selectByExample(CounselorExample example);

    Counselor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Counselor record, @Param("example") CounselorExample example);

    int updateByExample(@Param("record") Counselor record, @Param("example") CounselorExample example);

    int updateByPrimaryKeySelective(Counselor record);

    int updateByPrimaryKey(Counselor record);
}