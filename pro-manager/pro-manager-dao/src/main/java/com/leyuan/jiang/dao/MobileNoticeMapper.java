package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.MobileNotice;
import com.leyuan.jiang.pojo.po.MobileNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileNoticeMapper {
    int countByExample(MobileNoticeExample example);

    int deleteByExample(MobileNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MobileNotice record);

    int insertSelective(MobileNotice record);

    List<MobileNotice> selectByExample(MobileNoticeExample example);

    MobileNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MobileNotice record, @Param("example") MobileNoticeExample example);

    int updateByExample(@Param("record") MobileNotice record, @Param("example") MobileNoticeExample example);

    int updateByPrimaryKeySelective(MobileNotice record);

    int updateByPrimaryKey(MobileNotice record);
}