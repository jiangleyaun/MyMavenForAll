package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.Cause;
import com.leyuan.jiang.pojo.po.CauseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CauseMapper {
    int countByExample(CauseExample example);

    int deleteByExample(CauseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cause record);

    int insertSelective(Cause record);

    List<Cause> selectByExample(CauseExample example);

    Cause selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cause record, @Param("example") CauseExample example);

    int updateByExample(@Param("record") Cause record, @Param("example") CauseExample example);

    int updateByPrimaryKeySelective(Cause record);

    int updateByPrimaryKey(Cause record);
}