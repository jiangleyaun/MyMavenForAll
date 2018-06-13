package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.Disputes;
import com.leyuan.jiang.pojo.po.DisputesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisputesMapper {
    int countByExample(DisputesExample example);

    int deleteByExample(DisputesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Disputes record);

    int insertSelective(Disputes record);

    List<Disputes> selectByExample(DisputesExample example);

    Disputes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Disputes record, @Param("example") DisputesExample example);

    int updateByExample(@Param("record") Disputes record, @Param("example") DisputesExample example);

    int updateByPrimaryKeySelective(Disputes record);

    int updateByPrimaryKey(Disputes record);
}