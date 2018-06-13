package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.Sanctuary;
import com.leyuan.jiang.pojo.po.SanctuaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SanctuaryMapper {
    int countByExample(SanctuaryExample example);

    int deleteByExample(SanctuaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sanctuary record);

    int insertSelective(Sanctuary record);

    List<Sanctuary> selectByExample(SanctuaryExample example);

    Sanctuary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sanctuary record, @Param("example") SanctuaryExample example);

    int updateByExample(@Param("record") Sanctuary record, @Param("example") SanctuaryExample example);

    int updateByPrimaryKeySelective(Sanctuary record);

    int updateByPrimaryKey(Sanctuary record);
}