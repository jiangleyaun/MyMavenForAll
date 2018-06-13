package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.Session;
import com.leyuan.jiang.pojo.po.SessionExample;
import com.leyuan.jiang.pojo.po.SessionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionMapper {
    int countByExample(SessionExample example);

    int deleteByExample(SessionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SessionWithBLOBs record);

    int insertSelective(SessionWithBLOBs record);

    List<SessionWithBLOBs> selectByExampleWithBLOBs(SessionExample example);

    List<Session> selectByExample(SessionExample example);

    SessionWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SessionWithBLOBs record, @Param("example") SessionExample example);

    int updateByExampleWithBLOBs(@Param("record") SessionWithBLOBs record, @Param("example") SessionExample example);

    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByPrimaryKeySelective(SessionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SessionWithBLOBs record);

    int updateByPrimaryKey(Session record);
}