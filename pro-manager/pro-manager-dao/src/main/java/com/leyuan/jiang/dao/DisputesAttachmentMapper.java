package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.DisputesAttachment;
import com.leyuan.jiang.pojo.po.DisputesAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisputesAttachmentMapper {
    int countByExample(DisputesAttachmentExample example);

    int deleteByExample(DisputesAttachmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DisputesAttachment record);

    int insertSelective(DisputesAttachment record);

    List<DisputesAttachment> selectByExample(DisputesAttachmentExample example);

    DisputesAttachment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DisputesAttachment record, @Param("example") DisputesAttachmentExample example);

    int updateByExample(@Param("record") DisputesAttachment record, @Param("example") DisputesAttachmentExample example);

    int updateByPrimaryKeySelective(DisputesAttachment record);

    int updateByPrimaryKey(DisputesAttachment record);
}