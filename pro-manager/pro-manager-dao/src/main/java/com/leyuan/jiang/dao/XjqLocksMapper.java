package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqLocksExample;
import com.leyuan.jiang.pojo.po.XjqLocksKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqLocksMapper {
    int countByExample(XjqLocksExample example);

    int deleteByExample(XjqLocksExample example);

    int deleteByPrimaryKey(XjqLocksKey key);

    int insert(XjqLocksKey record);

    int insertSelective(XjqLocksKey record);

    List<XjqLocksKey> selectByExample(XjqLocksExample example);

    int updateByExampleSelective(@Param("record") XjqLocksKey record, @Param("example") XjqLocksExample example);

    int updateByExample(@Param("record") XjqLocksKey record, @Param("example") XjqLocksExample example);
}