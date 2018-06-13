package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentChildren;
import com.leyuan.jiang.pojo.po.ViolentChildrenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentChildrenMapper {
    int countByExample(ViolentChildrenExample example);

    int deleteByExample(ViolentChildrenExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentChildren record);

    int insertSelective(ViolentChildren record);

    List<ViolentChildren> selectByExample(ViolentChildrenExample example);

    ViolentChildren selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentChildren record, @Param("example") ViolentChildrenExample example);

    int updateByExample(@Param("record") ViolentChildren record, @Param("example") ViolentChildrenExample example);

    int updateByPrimaryKeySelective(ViolentChildren record);

    int updateByPrimaryKey(ViolentChildren record);
}