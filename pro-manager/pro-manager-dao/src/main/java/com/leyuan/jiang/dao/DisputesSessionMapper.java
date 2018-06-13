package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.DisputesSession;
import com.leyuan.jiang.pojo.po.DisputesSessionExample;
import com.leyuan.jiang.pojo.po.DisputesSessionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisputesSessionMapper {
    int countByExample(DisputesSessionExample example);

    int deleteByExample(DisputesSessionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DisputesSessionWithBLOBs record);

    int insertSelective(DisputesSessionWithBLOBs record);

    List<DisputesSessionWithBLOBs> selectByExampleWithBLOBs(DisputesSessionExample example);

    List<DisputesSession> selectByExample(DisputesSessionExample example);

    DisputesSessionWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DisputesSessionWithBLOBs record, @Param("example") DisputesSessionExample example);

    int updateByExampleWithBLOBs(@Param("record") DisputesSessionWithBLOBs record, @Param("example") DisputesSessionExample example);

    int updateByExample(@Param("record") DisputesSession record, @Param("example") DisputesSessionExample example);

    int updateByPrimaryKeySelective(DisputesSessionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DisputesSessionWithBLOBs record);

    int updateByPrimaryKey(DisputesSession record);
}