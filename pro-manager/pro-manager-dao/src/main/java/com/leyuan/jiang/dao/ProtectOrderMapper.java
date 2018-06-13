package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ProtectOrder;
import com.leyuan.jiang.pojo.po.ProtectOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtectOrderMapper {
    int countByExample(ProtectOrderExample example);

    int deleteByExample(ProtectOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProtectOrder record);

    int insertSelective(ProtectOrder record);

    List<ProtectOrder> selectByExampleWithBLOBs(ProtectOrderExample example);

    List<ProtectOrder> selectByExample(ProtectOrderExample example);

    ProtectOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProtectOrder record, @Param("example") ProtectOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") ProtectOrder record, @Param("example") ProtectOrderExample example);

    int updateByExample(@Param("record") ProtectOrder record, @Param("example") ProtectOrderExample example);

    int updateByPrimaryKeySelective(ProtectOrder record);

    int updateByPrimaryKeyWithBLOBs(ProtectOrder record);

    int updateByPrimaryKey(ProtectOrder record);
}