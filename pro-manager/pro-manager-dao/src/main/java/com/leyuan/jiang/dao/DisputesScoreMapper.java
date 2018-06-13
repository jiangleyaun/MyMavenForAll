package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.DisputesScore;
import com.leyuan.jiang.pojo.po.DisputesScoreExample;
import com.leyuan.jiang.pojo.po.DisputesScoreWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisputesScoreMapper {
    int countByExample(DisputesScoreExample example);

    int deleteByExample(DisputesScoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DisputesScoreWithBLOBs record);

    int insertSelective(DisputesScoreWithBLOBs record);

    List<DisputesScoreWithBLOBs> selectByExampleWithBLOBs(DisputesScoreExample example);

    List<DisputesScore> selectByExample(DisputesScoreExample example);

    DisputesScoreWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DisputesScoreWithBLOBs record, @Param("example") DisputesScoreExample example);

    int updateByExampleWithBLOBs(@Param("record") DisputesScoreWithBLOBs record, @Param("example") DisputesScoreExample example);

    int updateByExample(@Param("record") DisputesScore record, @Param("example") DisputesScoreExample example);

    int updateByPrimaryKeySelective(DisputesScoreWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DisputesScoreWithBLOBs record);

    int updateByPrimaryKey(DisputesScore record);
}