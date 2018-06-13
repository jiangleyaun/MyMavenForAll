package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqSimpropTriggers;
import com.leyuan.jiang.pojo.po.XjqSimpropTriggersExample;
import com.leyuan.jiang.pojo.po.XjqSimpropTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqSimpropTriggersMapper {
    int countByExample(XjqSimpropTriggersExample example);

    int deleteByExample(XjqSimpropTriggersExample example);

    int deleteByPrimaryKey(XjqSimpropTriggersKey key);

    int insert(XjqSimpropTriggers record);

    int insertSelective(XjqSimpropTriggers record);

    List<XjqSimpropTriggers> selectByExample(XjqSimpropTriggersExample example);

    XjqSimpropTriggers selectByPrimaryKey(XjqSimpropTriggersKey key);

    int updateByExampleSelective(@Param("record") XjqSimpropTriggers record, @Param("example") XjqSimpropTriggersExample example);

    int updateByExample(@Param("record") XjqSimpropTriggers record, @Param("example") XjqSimpropTriggersExample example);

    int updateByPrimaryKeySelective(XjqSimpropTriggers record);

    int updateByPrimaryKey(XjqSimpropTriggers record);
}