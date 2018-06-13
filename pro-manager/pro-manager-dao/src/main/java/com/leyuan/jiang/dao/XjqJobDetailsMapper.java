package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.XjqJobDetails;
import com.leyuan.jiang.pojo.po.XjqJobDetailsExample;
import com.leyuan.jiang.pojo.po.XjqJobDetailsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjqJobDetailsMapper {
    int countByExample(XjqJobDetailsExample example);

    int deleteByExample(XjqJobDetailsExample example);

    int deleteByPrimaryKey(XjqJobDetailsKey key);

    int insert(XjqJobDetails record);

    int insertSelective(XjqJobDetails record);

    List<XjqJobDetails> selectByExampleWithBLOBs(XjqJobDetailsExample example);

    List<XjqJobDetails> selectByExample(XjqJobDetailsExample example);

    XjqJobDetails selectByPrimaryKey(XjqJobDetailsKey key);

    int updateByExampleSelective(@Param("record") XjqJobDetails record, @Param("example") XjqJobDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") XjqJobDetails record, @Param("example") XjqJobDetailsExample example);

    int updateByExample(@Param("record") XjqJobDetails record, @Param("example") XjqJobDetailsExample example);

    int updateByPrimaryKeySelective(XjqJobDetails record);

    int updateByPrimaryKeyWithBLOBs(XjqJobDetails record);

    int updateByPrimaryKey(XjqJobDetails record);
}