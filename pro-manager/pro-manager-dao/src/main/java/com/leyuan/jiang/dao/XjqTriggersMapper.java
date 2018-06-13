package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqTriggers;
import com.leyuan.jiang.pojo.po.XjqTriggersExample;
import com.leyuan.jiang.pojo.po.XjqTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqTriggersMapper {
    int countByExample(XjqTriggersExample example);

    int deleteByExample(XjqTriggersExample example);

    int deleteByPrimaryKey(XjqTriggersKey key);

    int insert(XjqTriggers record);

    int insertSelective(XjqTriggers record);

    List<XjqTriggers> selectByExampleWithBLOBs(XjqTriggersExample example);

    List<XjqTriggers> selectByExample(XjqTriggersExample example);

    XjqTriggers selectByPrimaryKey(XjqTriggersKey key);

    int updateByExampleSelective(@Param("record") XjqTriggers record, @Param("example") XjqTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") XjqTriggers record, @Param("example") XjqTriggersExample example);

    int updateByExample(@Param("record") XjqTriggers record, @Param("example") XjqTriggersExample example);

    int updateByPrimaryKeySelective(XjqTriggers record);

    int updateByPrimaryKeyWithBLOBs(XjqTriggers record);

    int updateByPrimaryKey(XjqTriggers record);
}