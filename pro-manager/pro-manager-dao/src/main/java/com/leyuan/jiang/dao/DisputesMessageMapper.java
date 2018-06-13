package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.DisputesMessage;
import com.leyuan.jiang.pojo.po.DisputesMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisputesMessageMapper {
    int countByExample(DisputesMessageExample example);

    int deleteByExample(DisputesMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DisputesMessage record);

    int insertSelective(DisputesMessage record);

    List<DisputesMessage> selectByExampleWithBLOBs(DisputesMessageExample example);

    List<DisputesMessage> selectByExample(DisputesMessageExample example);

    DisputesMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DisputesMessage record, @Param("example") DisputesMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") DisputesMessage record, @Param("example") DisputesMessageExample example);

    int updateByExample(@Param("record") DisputesMessage record, @Param("example") DisputesMessageExample example);

    int updateByPrimaryKeySelective(DisputesMessage record);

    int updateByPrimaryKeyWithBLOBs(DisputesMessage record);

    int updateByPrimaryKey(DisputesMessage record);
}