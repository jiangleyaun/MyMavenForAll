package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.DisputesData;
import com.leyuan.jiang.pojo.po.DisputesDataExample;
import com.leyuan.jiang.pojo.po.DisputesDataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisputesDataMapper {
    int countByExample(DisputesDataExample example);

    int deleteByExample(DisputesDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DisputesDataWithBLOBs record);

    int insertSelective(DisputesDataWithBLOBs record);

    List<DisputesDataWithBLOBs> selectByExampleWithBLOBs(DisputesDataExample example);

    List<DisputesData> selectByExample(DisputesDataExample example);

    DisputesDataWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DisputesDataWithBLOBs record, @Param("example") DisputesDataExample example);

    int updateByExampleWithBLOBs(@Param("record") DisputesDataWithBLOBs record, @Param("example") DisputesDataExample example);

    int updateByExample(@Param("record") DisputesData record, @Param("example") DisputesDataExample example);

    int updateByPrimaryKeySelective(DisputesDataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DisputesDataWithBLOBs record);

    int updateByPrimaryKey(DisputesData record);
}