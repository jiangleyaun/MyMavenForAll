package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqSchedulerState;
import com.leyuan.jiang.pojo.po.XjqSchedulerStateExample;
import com.leyuan.jiang.pojo.po.XjqSchedulerStateKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqSchedulerStateMapper {
    int countByExample(XjqSchedulerStateExample example);

    int deleteByExample(XjqSchedulerStateExample example);

    int deleteByPrimaryKey(XjqSchedulerStateKey key);

    int insert(XjqSchedulerState record);

    int insertSelective(XjqSchedulerState record);

    List<XjqSchedulerState> selectByExample(XjqSchedulerStateExample example);

    XjqSchedulerState selectByPrimaryKey(XjqSchedulerStateKey key);

    int updateByExampleSelective(@Param("record") XjqSchedulerState record, @Param("example") XjqSchedulerStateExample example);

    int updateByExample(@Param("record") XjqSchedulerState record, @Param("example") XjqSchedulerStateExample example);

    int updateByPrimaryKeySelective(XjqSchedulerState record);

    int updateByPrimaryKey(XjqSchedulerState record);
}