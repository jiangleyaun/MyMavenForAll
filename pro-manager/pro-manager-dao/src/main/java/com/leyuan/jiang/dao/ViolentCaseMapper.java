package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentCase;
import com.leyuan.jiang.pojo.po.ViolentCaseExample;
import com.leyuan.jiang.pojo.po.ViolentCaseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentCaseMapper {
    int countByExample(ViolentCaseExample example);

    int deleteByExample(ViolentCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentCaseWithBLOBs record);

    int insertSelective(ViolentCaseWithBLOBs record);

    List<ViolentCaseWithBLOBs> selectByExampleWithBLOBs(ViolentCaseExample example);

    List<ViolentCase> selectByExample(ViolentCaseExample example);

    ViolentCaseWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentCaseWithBLOBs record, @Param("example") ViolentCaseExample example);

    int updateByExampleWithBLOBs(@Param("record") ViolentCaseWithBLOBs record, @Param("example") ViolentCaseExample example);

    int updateByExample(@Param("record") ViolentCase record, @Param("example") ViolentCaseExample example);

    int updateByPrimaryKeySelective(ViolentCaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ViolentCaseWithBLOBs record);

    int updateByPrimaryKey(ViolentCase record);
}