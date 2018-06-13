package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentReason;
import com.leyuan.jiang.pojo.po.ViolentReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentReasonMapper {
    int countByExample(ViolentReasonExample example);

    int deleteByExample(ViolentReasonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentReason record);

    int insertSelective(ViolentReason record);

    List<ViolentReason> selectByExampleWithBLOBs(ViolentReasonExample example);

    List<ViolentReason> selectByExample(ViolentReasonExample example);

    ViolentReason selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentReason record, @Param("example") ViolentReasonExample example);

    int updateByExampleWithBLOBs(@Param("record") ViolentReason record, @Param("example") ViolentReasonExample example);

    int updateByExample(@Param("record") ViolentReason record, @Param("example") ViolentReasonExample example);

    int updateByPrimaryKeySelective(ViolentReason record);

    int updateByPrimaryKeyWithBLOBs(ViolentReason record);

    int updateByPrimaryKey(ViolentReason record);
}