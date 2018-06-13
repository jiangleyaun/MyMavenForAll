package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentVideo;
import com.leyuan.jiang.pojo.po.ViolentVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentVideoMapper {
    int countByExample(ViolentVideoExample example);

    int deleteByExample(ViolentVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentVideo record);

    int insertSelective(ViolentVideo record);

    List<ViolentVideo> selectByExample(ViolentVideoExample example);

    ViolentVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentVideo record, @Param("example") ViolentVideoExample example);

    int updateByExample(@Param("record") ViolentVideo record, @Param("example") ViolentVideoExample example);

    int updateByPrimaryKeySelective(ViolentVideo record);

    int updateByPrimaryKey(ViolentVideo record);
}