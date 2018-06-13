package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.SanctuaryAdminUser;
import com.leyuan.jiang.pojo.po.SanctuaryAdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SanctuaryAdminUserMapper {
    int countByExample(SanctuaryAdminUserExample example);

    int deleteByExample(SanctuaryAdminUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SanctuaryAdminUser record);

    int insertSelective(SanctuaryAdminUser record);

    List<SanctuaryAdminUser> selectByExample(SanctuaryAdminUserExample example);

    SanctuaryAdminUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SanctuaryAdminUser record, @Param("example") SanctuaryAdminUserExample example);

    int updateByExample(@Param("record") SanctuaryAdminUser record, @Param("example") SanctuaryAdminUserExample example);

    int updateByPrimaryKeySelective(SanctuaryAdminUser record);

    int updateByPrimaryKey(SanctuaryAdminUser record);
}