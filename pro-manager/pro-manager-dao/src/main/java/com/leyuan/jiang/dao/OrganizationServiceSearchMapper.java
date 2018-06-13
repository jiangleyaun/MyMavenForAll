package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.OrganizationServiceSearch;
import com.leyuan.jiang.pojo.po.OrganizationServiceSearchExample;
import com.leyuan.jiang.pojo.po.OrganizationServiceSearchKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationServiceSearchMapper {
    int countByExample(OrganizationServiceSearchExample example);

    int deleteByExample(OrganizationServiceSearchExample example);

    int deleteByPrimaryKey(OrganizationServiceSearchKey key);

    int insert(OrganizationServiceSearch record);

    int insertSelective(OrganizationServiceSearch record);

    List<OrganizationServiceSearch> selectByExample(OrganizationServiceSearchExample example);

    OrganizationServiceSearch selectByPrimaryKey(OrganizationServiceSearchKey key);

    int updateByExampleSelective(@Param("record") OrganizationServiceSearch record, @Param("example") OrganizationServiceSearchExample example);

    int updateByExample(@Param("record") OrganizationServiceSearch record, @Param("example") OrganizationServiceSearchExample example);

    int updateByPrimaryKeySelective(OrganizationServiceSearch record);

    int updateByPrimaryKey(OrganizationServiceSearch record);
}