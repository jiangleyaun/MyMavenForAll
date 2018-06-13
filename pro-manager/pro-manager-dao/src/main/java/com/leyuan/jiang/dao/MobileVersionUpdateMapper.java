package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.MobileVersionUpdate;
import com.leyuan.jiang.pojo.po.MobileVersionUpdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileVersionUpdateMapper {
    int countByExample(MobileVersionUpdateExample example);

    int deleteByExample(MobileVersionUpdateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MobileVersionUpdate record);

    int insertSelective(MobileVersionUpdate record);

    List<MobileVersionUpdate> selectByExample(MobileVersionUpdateExample example);

    MobileVersionUpdate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MobileVersionUpdate record, @Param("example") MobileVersionUpdateExample example);

    int updateByExample(@Param("record") MobileVersionUpdate record, @Param("example") MobileVersionUpdateExample example);

    int updateByPrimaryKeySelective(MobileVersionUpdate record);

    int updateByPrimaryKey(MobileVersionUpdate record);
}