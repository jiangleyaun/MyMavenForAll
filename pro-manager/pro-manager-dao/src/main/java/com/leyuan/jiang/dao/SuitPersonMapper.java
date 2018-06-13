package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.SuitPerson;
import com.leyuan.jiang.pojo.po.SuitPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuitPersonMapper {
    int countByExample(SuitPersonExample example);

    int deleteByExample(SuitPersonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SuitPerson record);

    int insertSelective(SuitPerson record);

    List<SuitPerson> selectByExample(SuitPersonExample example);

    SuitPerson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SuitPerson record, @Param("example") SuitPersonExample example);

    int updateByExample(@Param("record") SuitPerson record, @Param("example") SuitPersonExample example);

    int updateByPrimaryKeySelective(SuitPerson record);

    int updateByPrimaryKey(SuitPerson record);
}