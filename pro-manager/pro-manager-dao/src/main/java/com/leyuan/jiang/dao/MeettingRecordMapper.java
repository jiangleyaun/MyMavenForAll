package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.MeettingRecord;
import com.leyuan.jiang.pojo.po.MeettingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeettingRecordMapper {
    int countByExample(MeettingRecordExample example);

    int deleteByExample(MeettingRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MeettingRecord record);

    int insertSelective(MeettingRecord record);

    List<MeettingRecord> selectByExample(MeettingRecordExample example);

    MeettingRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MeettingRecord record, @Param("example") MeettingRecordExample example);

    int updateByExample(@Param("record") MeettingRecord record, @Param("example") MeettingRecordExample example);

    int updateByPrimaryKeySelective(MeettingRecord record);

    int updateByPrimaryKey(MeettingRecord record);
}