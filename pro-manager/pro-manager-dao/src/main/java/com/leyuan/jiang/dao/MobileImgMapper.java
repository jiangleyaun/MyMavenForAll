package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.MobileImg;
import com.leyuan.jiang.pojo.po.MobileImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileImgMapper {
    int countByExample(MobileImgExample example);

    int deleteByExample(MobileImgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MobileImg record);

    int insertSelective(MobileImg record);

    List<MobileImg> selectByExample(MobileImgExample example);

    MobileImg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MobileImg record, @Param("example") MobileImgExample example);

    int updateByExample(@Param("record") MobileImg record, @Param("example") MobileImgExample example);

    int updateByPrimaryKeySelective(MobileImg record);

    int updateByPrimaryKey(MobileImg record);
}