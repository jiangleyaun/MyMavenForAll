package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqPausedTriggerGrpsExample;
import com.leyuan.jiang.pojo.po.XjqPausedTriggerGrpsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqPausedTriggerGrpsMapper {
    int countByExample(XjqPausedTriggerGrpsExample example);

    int deleteByExample(XjqPausedTriggerGrpsExample example);

    int deleteByPrimaryKey(XjqPausedTriggerGrpsKey key);

    int insert(XjqPausedTriggerGrpsKey record);

    int insertSelective(XjqPausedTriggerGrpsKey record);

    List<XjqPausedTriggerGrpsKey> selectByExample(XjqPausedTriggerGrpsExample example);

    int updateByExampleSelective(@Param("record") XjqPausedTriggerGrpsKey record, @Param("example") XjqPausedTriggerGrpsExample example);

    int updateByExample(@Param("record") XjqPausedTriggerGrpsKey record, @Param("example") XjqPausedTriggerGrpsExample example);
}