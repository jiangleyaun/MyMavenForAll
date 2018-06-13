package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.PersonalSafetyProtectionOrder;
import com.leyuan.jiang.pojo.po.PersonalSafetyProtectionOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalSafetyProtectionOrderMapper {
    int countByExample(PersonalSafetyProtectionOrderExample example);

    int deleteByExample(PersonalSafetyProtectionOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PersonalSafetyProtectionOrder record);

    int insertSelective(PersonalSafetyProtectionOrder record);

    List<PersonalSafetyProtectionOrder> selectByExampleWithBLOBs(PersonalSafetyProtectionOrderExample example);

    List<PersonalSafetyProtectionOrder> selectByExample(PersonalSafetyProtectionOrderExample example);

    PersonalSafetyProtectionOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PersonalSafetyProtectionOrder record, @Param("example") PersonalSafetyProtectionOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") PersonalSafetyProtectionOrder record, @Param("example") PersonalSafetyProtectionOrderExample example);

    int updateByExample(@Param("record") PersonalSafetyProtectionOrder record, @Param("example") PersonalSafetyProtectionOrderExample example);

    int updateByPrimaryKeySelective(PersonalSafetyProtectionOrder record);

    int updateByPrimaryKeyWithBLOBs(PersonalSafetyProtectionOrder record);

    int updateByPrimaryKey(PersonalSafetyProtectionOrder record);
}