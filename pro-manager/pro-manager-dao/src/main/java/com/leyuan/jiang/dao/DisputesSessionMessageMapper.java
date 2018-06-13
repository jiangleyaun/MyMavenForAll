package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.DisputesSessionMessage;
import com.leyuan.jiang.pojo.po.DisputesSessionMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisputesSessionMessageMapper {
    int countByExample(DisputesSessionMessageExample example);

    int deleteByExample(DisputesSessionMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DisputesSessionMessage record);

    int insertSelective(DisputesSessionMessage record);

    List<DisputesSessionMessage> selectByExampleWithBLOBs(DisputesSessionMessageExample example);

    List<DisputesSessionMessage> selectByExample(DisputesSessionMessageExample example);

    DisputesSessionMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DisputesSessionMessage record, @Param("example") DisputesSessionMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") DisputesSessionMessage record, @Param("example") DisputesSessionMessageExample example);

    int updateByExample(@Param("record") DisputesSessionMessage record, @Param("example") DisputesSessionMessageExample example);

    int updateByPrimaryKeySelective(DisputesSessionMessage record);

    int updateByPrimaryKeyWithBLOBs(DisputesSessionMessage record);

    int updateByPrimaryKey(DisputesSessionMessage record);
}