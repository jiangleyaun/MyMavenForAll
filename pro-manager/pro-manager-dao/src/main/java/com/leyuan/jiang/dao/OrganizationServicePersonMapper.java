package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.OrganizationServicePerson;
import com.leyuan.jiang.pojo.po.OrganizationServicePersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationServicePersonMapper {
    int countByExample(OrganizationServicePersonExample example);

    int deleteByExample(OrganizationServicePersonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationServicePerson record);

    int insertSelective(OrganizationServicePerson record);

    List<OrganizationServicePerson> selectByExample(OrganizationServicePersonExample example);

    OrganizationServicePerson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationServicePerson record, @Param("example") OrganizationServicePersonExample example);

    int updateByExample(@Param("record") OrganizationServicePerson record, @Param("example") OrganizationServicePersonExample example);

    int updateByPrimaryKeySelective(OrganizationServicePerson record);

    int updateByPrimaryKey(OrganizationServicePerson record);
}