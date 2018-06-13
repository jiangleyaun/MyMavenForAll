package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.LawCaseTransferHistory;
import com.leyuan.jiang.pojo.po.LawCaseTransferHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LawCaseTransferHistoryMapper {
    int countByExample(LawCaseTransferHistoryExample example);

    int deleteByExample(LawCaseTransferHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LawCaseTransferHistory record);

    int insertSelective(LawCaseTransferHistory record);

    List<LawCaseTransferHistory> selectByExample(LawCaseTransferHistoryExample example);

    LawCaseTransferHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LawCaseTransferHistory record, @Param("example") LawCaseTransferHistoryExample example);

    int updateByExample(@Param("record") LawCaseTransferHistory record, @Param("example") LawCaseTransferHistoryExample example);

    int updateByPrimaryKeySelective(LawCaseTransferHistory record);

    int updateByPrimaryKey(LawCaseTransferHistory record);
}