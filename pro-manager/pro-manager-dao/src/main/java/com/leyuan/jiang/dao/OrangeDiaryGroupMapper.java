package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.OrangeDiaryGroup;
import com.leyuan.jiang.pojo.po.OrangeDiaryGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrangeDiaryGroupMapper {
    int countByExample(OrangeDiaryGroupExample example);

    int deleteByExample(OrangeDiaryGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrangeDiaryGroup record);

    int insertSelective(OrangeDiaryGroup record);

    List<OrangeDiaryGroup> selectByExample(OrangeDiaryGroupExample example);

    OrangeDiaryGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrangeDiaryGroup record, @Param("example") OrangeDiaryGroupExample example);

    int updateByExample(@Param("record") OrangeDiaryGroup record, @Param("example") OrangeDiaryGroupExample example);

    int updateByPrimaryKeySelective(OrangeDiaryGroup record);

    int updateByPrimaryKey(OrangeDiaryGroup record);
}