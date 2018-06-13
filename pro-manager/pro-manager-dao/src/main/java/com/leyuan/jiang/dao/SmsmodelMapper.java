package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.Smsmodel;
import com.leyuan.jiang.pojo.po.SmsmodelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsmodelMapper {
    int countByExample(SmsmodelExample example);

    int deleteByExample(SmsmodelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Smsmodel record);

    int insertSelective(Smsmodel record);

    List<Smsmodel> selectByExample(SmsmodelExample example);

    Smsmodel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Smsmodel record, @Param("example") SmsmodelExample example);

    int updateByExample(@Param("record") Smsmodel record, @Param("example") SmsmodelExample example);

    int updateByPrimaryKeySelective(Smsmodel record);

    int updateByPrimaryKey(Smsmodel record);
}