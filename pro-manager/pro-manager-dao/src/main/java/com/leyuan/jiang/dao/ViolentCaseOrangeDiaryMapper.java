package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentCaseOrangeDiary;
import com.leyuan.jiang.pojo.po.ViolentCaseOrangeDiaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentCaseOrangeDiaryMapper {
    int countByExample(ViolentCaseOrangeDiaryExample example);

    int deleteByExample(ViolentCaseOrangeDiaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentCaseOrangeDiary record);

    int insertSelective(ViolentCaseOrangeDiary record);

    List<ViolentCaseOrangeDiary> selectByExample(ViolentCaseOrangeDiaryExample example);

    ViolentCaseOrangeDiary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentCaseOrangeDiary record, @Param("example") ViolentCaseOrangeDiaryExample example);

    int updateByExample(@Param("record") ViolentCaseOrangeDiary record, @Param("example") ViolentCaseOrangeDiaryExample example);

    int updateByPrimaryKeySelective(ViolentCaseOrangeDiary record);

    int updateByPrimaryKey(ViolentCaseOrangeDiary record);
}