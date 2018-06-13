package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.LawCase;
import com.leyuan.jiang.pojo.po.LawCaseExample;
import com.leyuan.jiang.pojo.po.LawCaseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LawCaseMapper {
    int countByExample(LawCaseExample example);

    int deleteByExample(LawCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LawCaseWithBLOBs record);

    int insertSelective(LawCaseWithBLOBs record);

    List<LawCaseWithBLOBs> selectByExampleWithBLOBs(LawCaseExample example);

    List<LawCase> selectByExample(LawCaseExample example);

    LawCaseWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LawCaseWithBLOBs record, @Param("example") LawCaseExample example);

    int updateByExampleWithBLOBs(@Param("record") LawCaseWithBLOBs record, @Param("example") LawCaseExample example);

    int updateByExample(@Param("record") LawCase record, @Param("example") LawCaseExample example);

    int updateByPrimaryKeySelective(LawCaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LawCaseWithBLOBs record);

    int updateByPrimaryKey(LawCase record);
}