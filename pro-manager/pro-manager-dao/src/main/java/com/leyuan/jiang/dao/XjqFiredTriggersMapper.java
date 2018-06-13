package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqFiredTriggers;
import com.leyuan.jiang.pojo.po.XjqFiredTriggersExample;
import com.leyuan.jiang.pojo.po.XjqFiredTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqFiredTriggersMapper {
    int countByExample(XjqFiredTriggersExample example);

    int deleteByExample(XjqFiredTriggersExample example);

    int deleteByPrimaryKey(XjqFiredTriggersKey key);

    int insert(XjqFiredTriggers record);

    int insertSelective(XjqFiredTriggers record);

    List<XjqFiredTriggers> selectByExample(XjqFiredTriggersExample example);

    XjqFiredTriggers selectByPrimaryKey(XjqFiredTriggersKey key);

    int updateByExampleSelective(@Param("record") XjqFiredTriggers record, @Param("example") XjqFiredTriggersExample example);

    int updateByExample(@Param("record") XjqFiredTriggers record, @Param("example") XjqFiredTriggersExample example);

    int updateByPrimaryKeySelective(XjqFiredTriggers record);

    int updateByPrimaryKey(XjqFiredTriggers record);
}