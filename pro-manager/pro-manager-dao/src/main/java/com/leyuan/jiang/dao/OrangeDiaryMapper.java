package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.OrangeDiary;
import com.leyuan.jiang.pojo.po.OrangeDiaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrangeDiaryMapper {
    int countByExample(OrangeDiaryExample example);

    int deleteByExample(OrangeDiaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrangeDiary record);

    int insertSelective(OrangeDiary record);

    List<OrangeDiary> selectByExampleWithBLOBs(OrangeDiaryExample example);

    List<OrangeDiary> selectByExample(OrangeDiaryExample example);

    OrangeDiary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrangeDiary record, @Param("example") OrangeDiaryExample example);

    int updateByExampleWithBLOBs(@Param("record") OrangeDiary record, @Param("example") OrangeDiaryExample example);

    int updateByExample(@Param("record") OrangeDiary record, @Param("example") OrangeDiaryExample example);

    int updateByPrimaryKeySelective(OrangeDiary record);

    int updateByPrimaryKeyWithBLOBs(OrangeDiary record);

    int updateByPrimaryKey(OrangeDiary record);
}