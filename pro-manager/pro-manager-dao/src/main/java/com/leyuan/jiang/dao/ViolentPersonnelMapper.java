package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentPersonnel;
import com.leyuan.jiang.pojo.po.ViolentPersonnelExample;
import com.leyuan.jiang.pojo.po.ViolentPersonnelWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentPersonnelMapper {
    int countByExample(ViolentPersonnelExample example);

    int deleteByExample(ViolentPersonnelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentPersonnelWithBLOBs record);

    int insertSelective(ViolentPersonnelWithBLOBs record);

    List<ViolentPersonnelWithBLOBs> selectByExampleWithBLOBs(ViolentPersonnelExample example);

    List<ViolentPersonnel> selectByExample(ViolentPersonnelExample example);

    ViolentPersonnelWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentPersonnelWithBLOBs record, @Param("example") ViolentPersonnelExample example);

    int updateByExampleWithBLOBs(@Param("record") ViolentPersonnelWithBLOBs record, @Param("example") ViolentPersonnelExample example);

    int updateByExample(@Param("record") ViolentPersonnel record, @Param("example") ViolentPersonnelExample example);

    int updateByPrimaryKeySelective(ViolentPersonnelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ViolentPersonnelWithBLOBs record);

    int updateByPrimaryKey(ViolentPersonnel record);
}