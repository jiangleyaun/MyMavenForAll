package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.PsyRecord;
import com.leyuan.jiang.pojo.po.PsyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsyRecordMapper {
    int countByExample(PsyRecordExample example);

    int deleteByExample(PsyRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PsyRecord record);

    int insertSelective(PsyRecord record);

    List<PsyRecord> selectByExampleWithBLOBs(PsyRecordExample example);

    List<PsyRecord> selectByExample(PsyRecordExample example);

    PsyRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PsyRecord record, @Param("example") PsyRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") PsyRecord record, @Param("example") PsyRecordExample example);

    int updateByExample(@Param("record") PsyRecord record, @Param("example") PsyRecordExample example);

    int updateByPrimaryKeySelective(PsyRecord record);

    int updateByPrimaryKeyWithBLOBs(PsyRecord record);

    int updateByPrimaryKey(PsyRecord record);
}