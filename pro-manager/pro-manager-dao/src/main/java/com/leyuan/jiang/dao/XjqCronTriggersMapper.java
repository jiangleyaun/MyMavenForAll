package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqCronTriggers;
import com.leyuan.jiang.pojo.po.XjqCronTriggersExample;
import com.leyuan.jiang.pojo.po.XjqCronTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqCronTriggersMapper {
    int countByExample(XjqCronTriggersExample example);

    int deleteByExample(XjqCronTriggersExample example);

    int deleteByPrimaryKey(XjqCronTriggersKey key);

    int insert(XjqCronTriggers record);

    int insertSelective(XjqCronTriggers record);

    List<XjqCronTriggers> selectByExample(XjqCronTriggersExample example);

    XjqCronTriggers selectByPrimaryKey(XjqCronTriggersKey key);

    int updateByExampleSelective(@Param("record") XjqCronTriggers record, @Param("example") XjqCronTriggersExample example);

    int updateByExample(@Param("record") XjqCronTriggers record, @Param("example") XjqCronTriggersExample example);

    int updateByPrimaryKeySelective(XjqCronTriggers record);

    int updateByPrimaryKey(XjqCronTriggers record);
}