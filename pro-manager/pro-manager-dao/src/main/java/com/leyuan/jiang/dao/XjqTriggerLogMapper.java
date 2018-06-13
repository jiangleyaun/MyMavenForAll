package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqTriggerLog;
import com.leyuan.jiang.pojo.po.XjqTriggerLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqTriggerLogMapper {
    int countByExample(XjqTriggerLogExample example);

    int deleteByExample(XjqTriggerLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XjqTriggerLog record);

    int insertSelective(XjqTriggerLog record);

    List<XjqTriggerLog> selectByExample(XjqTriggerLogExample example);

    XjqTriggerLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XjqTriggerLog record, @Param("example") XjqTriggerLogExample example);

    int updateByExample(@Param("record") XjqTriggerLog record, @Param("example") XjqTriggerLogExample example);

    int updateByPrimaryKeySelective(XjqTriggerLog record);

    int updateByPrimaryKey(XjqTriggerLog record);
}