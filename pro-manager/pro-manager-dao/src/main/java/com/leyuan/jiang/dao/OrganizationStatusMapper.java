package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.OrganizationStatus;
import com.leyuan.jiang.pojo.po.OrganizationStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationStatusMapper {
    int countByExample(OrganizationStatusExample example);

    int deleteByExample(OrganizationStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationStatus record);

    int insertSelective(OrganizationStatus record);

    List<OrganizationStatus> selectByExample(OrganizationStatusExample example);

    OrganizationStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationStatus record, @Param("example") OrganizationStatusExample example);

    int updateByExample(@Param("record") OrganizationStatus record, @Param("example") OrganizationStatusExample example);

    int updateByPrimaryKeySelective(OrganizationStatus record);

    int updateByPrimaryKey(OrganizationStatus record);
}