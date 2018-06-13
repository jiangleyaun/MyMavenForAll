package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqTriggerGroup;
import com.leyuan.jiang.pojo.po.XjqTriggerGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqTriggerGroupMapper {
    int countByExample(XjqTriggerGroupExample example);

    int deleteByExample(XjqTriggerGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XjqTriggerGroup record);

    int insertSelective(XjqTriggerGroup record);

    List<XjqTriggerGroup> selectByExample(XjqTriggerGroupExample example);

    XjqTriggerGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XjqTriggerGroup record, @Param("example") XjqTriggerGroupExample example);

    int updateByExample(@Param("record") XjqTriggerGroup record, @Param("example") XjqTriggerGroupExample example);

    int updateByPrimaryKeySelective(XjqTriggerGroup record);

    int updateByPrimaryKey(XjqTriggerGroup record);
}