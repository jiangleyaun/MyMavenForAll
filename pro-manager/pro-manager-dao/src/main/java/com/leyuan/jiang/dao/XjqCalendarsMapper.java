package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqCalendars;
import com.leyuan.jiang.pojo.po.XjqCalendarsExample;
import com.leyuan.jiang.pojo.po.XjqCalendarsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqCalendarsMapper {
    int countByExample(XjqCalendarsExample example);

    int deleteByExample(XjqCalendarsExample example);

    int deleteByPrimaryKey(XjqCalendarsKey key);

    int insert(XjqCalendars record);

    int insertSelective(XjqCalendars record);

    List<XjqCalendars> selectByExampleWithBLOBs(XjqCalendarsExample example);

    List<XjqCalendars> selectByExample(XjqCalendarsExample example);

    XjqCalendars selectByPrimaryKey(XjqCalendarsKey key);

    int updateByExampleSelective(@Param("record") XjqCalendars record, @Param("example") XjqCalendarsExample example);

    int updateByExampleWithBLOBs(@Param("record") XjqCalendars record, @Param("example") XjqCalendarsExample example);

    int updateByExample(@Param("record") XjqCalendars record, @Param("example") XjqCalendarsExample example);

    int updateByPrimaryKeySelective(XjqCalendars record);

    int updateByPrimaryKeyWithBLOBs(XjqCalendars record);
}