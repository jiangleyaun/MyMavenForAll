package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ProtectMeasure;
import com.leyuan.jiang.pojo.po.ProtectMeasureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtectMeasureMapper {
    int countByExample(ProtectMeasureExample example);

    int deleteByExample(ProtectMeasureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProtectMeasure record);

    int insertSelective(ProtectMeasure record);

    List<ProtectMeasure> selectByExample(ProtectMeasureExample example);

    ProtectMeasure selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProtectMeasure record, @Param("example") ProtectMeasureExample example);

    int updateByExample(@Param("record") ProtectMeasure record, @Param("example") ProtectMeasureExample example);

    int updateByPrimaryKeySelective(ProtectMeasure record);

    int updateByPrimaryKey(ProtectMeasure record);
}