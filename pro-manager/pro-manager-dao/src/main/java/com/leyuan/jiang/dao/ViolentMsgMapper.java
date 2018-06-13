package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentMsg;
import com.leyuan.jiang.pojo.po.ViolentMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentMsgMapper {
    int countByExample(ViolentMsgExample example);

    int deleteByExample(ViolentMsgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentMsg record);

    int insertSelective(ViolentMsg record);

    List<ViolentMsg> selectByExampleWithBLOBs(ViolentMsgExample example);

    List<ViolentMsg> selectByExample(ViolentMsgExample example);

    ViolentMsg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentMsg record, @Param("example") ViolentMsgExample example);

    int updateByExampleWithBLOBs(@Param("record") ViolentMsg record, @Param("example") ViolentMsgExample example);

    int updateByExample(@Param("record") ViolentMsg record, @Param("example") ViolentMsgExample example);

    int updateByPrimaryKeySelective(ViolentMsg record);

    int updateByPrimaryKeyWithBLOBs(ViolentMsg record);

    int updateByPrimaryKey(ViolentMsg record);
}