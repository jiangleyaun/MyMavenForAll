package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.OrganizationType;
import com.leyuan.jiang.pojo.po.OrganizationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationTypeMapper {
    int countByExample(OrganizationTypeExample example);

    int deleteByExample(OrganizationTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationType record);

    int insertSelective(OrganizationType record);

    List<OrganizationType> selectByExample(OrganizationTypeExample example);

    OrganizationType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationType record, @Param("example") OrganizationTypeExample example);

    int updateByExample(@Param("record") OrganizationType record, @Param("example") OrganizationTypeExample example);

    int updateByPrimaryKeySelective(OrganizationType record);

    int updateByPrimaryKey(OrganizationType record);
}