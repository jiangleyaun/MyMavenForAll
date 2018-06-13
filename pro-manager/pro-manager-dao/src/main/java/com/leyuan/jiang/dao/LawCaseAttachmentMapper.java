package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.LawCaseAttachment;
import com.leyuan.jiang.pojo.po.LawCaseAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LawCaseAttachmentMapper {
    int countByExample(LawCaseAttachmentExample example);

    int deleteByExample(LawCaseAttachmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LawCaseAttachment record);

    int insertSelective(LawCaseAttachment record);

    List<LawCaseAttachment> selectByExampleWithBLOBs(LawCaseAttachmentExample example);

    List<LawCaseAttachment> selectByExample(LawCaseAttachmentExample example);

    LawCaseAttachment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LawCaseAttachment record, @Param("example") LawCaseAttachmentExample example);

    int updateByExampleWithBLOBs(@Param("record") LawCaseAttachment record, @Param("example") LawCaseAttachmentExample example);

    int updateByExample(@Param("record") LawCaseAttachment record, @Param("example") LawCaseAttachmentExample example);

    int updateByPrimaryKeySelective(LawCaseAttachment record);

    int updateByPrimaryKeyWithBLOBs(LawCaseAttachment record);

    int updateByPrimaryKey(LawCaseAttachment record);
}