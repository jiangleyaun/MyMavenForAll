package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.SanctuaryPremDetail;
import com.leyuan.jiang.pojo.po.SanctuaryPremDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SanctuaryPremDetailMapper {
    int countByExample(SanctuaryPremDetailExample example);

    int deleteByExample(SanctuaryPremDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SanctuaryPremDetail record);

    int insertSelective(SanctuaryPremDetail record);

    List<SanctuaryPremDetail> selectByExample(SanctuaryPremDetailExample example);

    SanctuaryPremDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SanctuaryPremDetail record, @Param("example") SanctuaryPremDetailExample example);

    int updateByExample(@Param("record") SanctuaryPremDetail record, @Param("example") SanctuaryPremDetailExample example);

    int updateByPrimaryKeySelective(SanctuaryPremDetail record);

    int updateByPrimaryKey(SanctuaryPremDetail record);
}