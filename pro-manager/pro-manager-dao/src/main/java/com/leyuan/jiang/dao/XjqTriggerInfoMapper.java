package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqTriggerInfo;
import com.leyuan.jiang.pojo.po.XjqTriggerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqTriggerInfoMapper {
    int countByExample(XjqTriggerInfoExample example);

    int deleteByExample(XjqTriggerInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XjqTriggerInfo record);

    int insertSelective(XjqTriggerInfo record);

    List<XjqTriggerInfo> selectByExampleWithBLOBs(XjqTriggerInfoExample example);

    List<XjqTriggerInfo> selectByExample(XjqTriggerInfoExample example);

    XjqTriggerInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XjqTriggerInfo record, @Param("example") XjqTriggerInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") XjqTriggerInfo record, @Param("example") XjqTriggerInfoExample example);

    int updateByExample(@Param("record") XjqTriggerInfo record, @Param("example") XjqTriggerInfoExample example);

    int updateByPrimaryKeySelective(XjqTriggerInfo record);

    int updateByPrimaryKeyWithBLOBs(XjqTriggerInfo record);

    int updateByPrimaryKey(XjqTriggerInfo record);
}