package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ProtectProgress;
import com.leyuan.jiang.pojo.po.ProtectProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtectProgressMapper {
    int countByExample(ProtectProgressExample example);

    int deleteByExample(ProtectProgressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProtectProgress record);

    int insertSelective(ProtectProgress record);

    List<ProtectProgress> selectByExample(ProtectProgressExample example);

    ProtectProgress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProtectProgress record, @Param("example") ProtectProgressExample example);

    int updateByExample(@Param("record") ProtectProgress record, @Param("example") ProtectProgressExample example);

    int updateByPrimaryKeySelective(ProtectProgress record);

    int updateByPrimaryKey(ProtectProgress record);
}