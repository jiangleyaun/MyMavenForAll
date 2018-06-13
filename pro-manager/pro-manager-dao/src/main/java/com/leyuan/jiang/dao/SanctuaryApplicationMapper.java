package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.SanctuaryApplication;
import com.leyuan.jiang.pojo.po.SanctuaryApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SanctuaryApplicationMapper {
    int countByExample(SanctuaryApplicationExample example);

    int deleteByExample(SanctuaryApplicationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SanctuaryApplication record);

    int insertSelective(SanctuaryApplication record);

    List<SanctuaryApplication> selectByExample(SanctuaryApplicationExample example);

    SanctuaryApplication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SanctuaryApplication record, @Param("example") SanctuaryApplicationExample example);

    int updateByExample(@Param("record") SanctuaryApplication record, @Param("example") SanctuaryApplicationExample example);

    int updateByPrimaryKeySelective(SanctuaryApplication record);

    int updateByPrimaryKey(SanctuaryApplication record);
}