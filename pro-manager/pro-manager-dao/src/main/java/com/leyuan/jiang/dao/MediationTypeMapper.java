package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.MediationType;
import com.leyuan.jiang.pojo.po.MediationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediationTypeMapper {
    int countByExample(MediationTypeExample example);

    int deleteByExample(MediationTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MediationType record);

    int insertSelective(MediationType record);

    List<MediationType> selectByExample(MediationTypeExample example);

    MediationType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MediationType record, @Param("example") MediationTypeExample example);

    int updateByExample(@Param("record") MediationType record, @Param("example") MediationTypeExample example);

    int updateByPrimaryKeySelective(MediationType record);

    int updateByPrimaryKey(MediationType record);
}