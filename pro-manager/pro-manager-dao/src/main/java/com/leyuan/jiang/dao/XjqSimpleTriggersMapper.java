package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqSimpleTriggers;
import com.leyuan.jiang.pojo.po.XjqSimpleTriggersExample;
import com.leyuan.jiang.pojo.po.XjqSimpleTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqSimpleTriggersMapper {
    int countByExample(XjqSimpleTriggersExample example);

    int deleteByExample(XjqSimpleTriggersExample example);

    int deleteByPrimaryKey(XjqSimpleTriggersKey key);

    int insert(XjqSimpleTriggers record);

    int insertSelective(XjqSimpleTriggers record);

    List<XjqSimpleTriggers> selectByExample(XjqSimpleTriggersExample example);

    XjqSimpleTriggers selectByPrimaryKey(XjqSimpleTriggersKey key);

    int updateByExampleSelective(@Param("record") XjqSimpleTriggers record, @Param("example") XjqSimpleTriggersExample example);

    int updateByExample(@Param("record") XjqSimpleTriggers record, @Param("example") XjqSimpleTriggersExample example);

    int updateByPrimaryKeySelective(XjqSimpleTriggers record);

    int updateByPrimaryKey(XjqSimpleTriggers record);
}