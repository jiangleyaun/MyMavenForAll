package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentPrivacy;
import com.leyuan.jiang.pojo.po.ViolentPrivacyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentPrivacyMapper {
    int countByExample(ViolentPrivacyExample example);

    int deleteByExample(ViolentPrivacyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentPrivacy record);

    int insertSelective(ViolentPrivacy record);

    List<ViolentPrivacy> selectByExampleWithBLOBs(ViolentPrivacyExample example);

    List<ViolentPrivacy> selectByExample(ViolentPrivacyExample example);

    ViolentPrivacy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentPrivacy record, @Param("example") ViolentPrivacyExample example);

    int updateByExampleWithBLOBs(@Param("record") ViolentPrivacy record, @Param("example") ViolentPrivacyExample example);

    int updateByExample(@Param("record") ViolentPrivacy record, @Param("example") ViolentPrivacyExample example);

    int updateByPrimaryKeySelective(ViolentPrivacy record);

    int updateByPrimaryKeyWithBLOBs(ViolentPrivacy record);

    int updateByPrimaryKey(ViolentPrivacy record);
}