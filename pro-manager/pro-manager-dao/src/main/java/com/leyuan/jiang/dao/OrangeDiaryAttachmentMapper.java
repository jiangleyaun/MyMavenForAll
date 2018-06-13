package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.OrangeDiaryAttachment;
import com.leyuan.jiang.pojo.po.OrangeDiaryAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrangeDiaryAttachmentMapper {
    int countByExample(OrangeDiaryAttachmentExample example);

    int deleteByExample(OrangeDiaryAttachmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrangeDiaryAttachment record);

    int insertSelective(OrangeDiaryAttachment record);

    List<OrangeDiaryAttachment> selectByExample(OrangeDiaryAttachmentExample example);

    OrangeDiaryAttachment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrangeDiaryAttachment record, @Param("example") OrangeDiaryAttachmentExample example);

    int updateByExample(@Param("record") OrangeDiaryAttachment record, @Param("example") OrangeDiaryAttachmentExample example);

    int updateByPrimaryKeySelective(OrangeDiaryAttachment record);

    int updateByPrimaryKey(OrangeDiaryAttachment record);
}