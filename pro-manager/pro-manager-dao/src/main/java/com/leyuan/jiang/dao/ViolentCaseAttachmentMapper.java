package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentCaseAttachment;
import com.leyuan.jiang.pojo.po.ViolentCaseAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentCaseAttachmentMapper {
    int countByExample(ViolentCaseAttachmentExample example);

    int deleteByExample(ViolentCaseAttachmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentCaseAttachment record);

    int insertSelective(ViolentCaseAttachment record);

    List<ViolentCaseAttachment> selectByExampleWithBLOBs(ViolentCaseAttachmentExample example);

    List<ViolentCaseAttachment> selectByExample(ViolentCaseAttachmentExample example);

    ViolentCaseAttachment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentCaseAttachment record, @Param("example") ViolentCaseAttachmentExample example);

    int updateByExampleWithBLOBs(@Param("record") ViolentCaseAttachment record, @Param("example") ViolentCaseAttachmentExample example);

    int updateByExample(@Param("record") ViolentCaseAttachment record, @Param("example") ViolentCaseAttachmentExample example);

    int updateByPrimaryKeySelective(ViolentCaseAttachment record);

    int updateByPrimaryKeyWithBLOBs(ViolentCaseAttachment record);

    int updateByPrimaryKey(ViolentCaseAttachment record);
}