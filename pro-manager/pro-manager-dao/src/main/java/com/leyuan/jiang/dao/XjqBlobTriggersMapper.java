package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqBlobTriggers;
import com.leyuan.jiang.pojo.po.XjqBlobTriggersExample;
import com.leyuan.jiang.pojo.po.XjqBlobTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqBlobTriggersMapper {
    int countByExample(XjqBlobTriggersExample example);

    int deleteByExample(XjqBlobTriggersExample example);

    int deleteByPrimaryKey(XjqBlobTriggersKey key);

    int insert(XjqBlobTriggers record);

    int insertSelective(XjqBlobTriggers record);

    List<XjqBlobTriggers> selectByExampleWithBLOBs(XjqBlobTriggersExample example);

    List<XjqBlobTriggers> selectByExample(XjqBlobTriggersExample example);

    XjqBlobTriggers selectByPrimaryKey(XjqBlobTriggersKey key);

    int updateByExampleSelective(@Param("record") XjqBlobTriggers record, @Param("example") XjqBlobTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") XjqBlobTriggers record, @Param("example") XjqBlobTriggersExample example);

    int updateByExample(@Param("record") XjqBlobTriggers record, @Param("example") XjqBlobTriggersExample example);

    int updateByPrimaryKeySelective(XjqBlobTriggers record);

    int updateByPrimaryKeyWithBLOBs(XjqBlobTriggers record);
}