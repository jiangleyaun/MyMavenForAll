package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.MessageLog;
import com.leyuan.jiang.pojo.po.MessageLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageLogMapper {
    int countByExample(MessageLogExample example);

    int deleteByExample(MessageLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MessageLog record);

    int insertSelective(MessageLog record);

    List<MessageLog> selectByExample(MessageLogExample example);

    MessageLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MessageLog record, @Param("example") MessageLogExample example);

    int updateByExample(@Param("record") MessageLog record, @Param("example") MessageLogExample example);

    int updateByPrimaryKeySelective(MessageLog record);

    int updateByPrimaryKey(MessageLog record);
}