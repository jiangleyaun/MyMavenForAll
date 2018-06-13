package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ViolentLiveMember;
import com.leyuan.jiang.pojo.po.ViolentLiveMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolentLiveMemberMapper {
    int countByExample(ViolentLiveMemberExample example);

    int deleteByExample(ViolentLiveMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ViolentLiveMember record);

    int insertSelective(ViolentLiveMember record);

    List<ViolentLiveMember> selectByExample(ViolentLiveMemberExample example);

    ViolentLiveMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ViolentLiveMember record, @Param("example") ViolentLiveMemberExample example);

    int updateByExample(@Param("record") ViolentLiveMember record, @Param("example") ViolentLiveMemberExample example);

    int updateByPrimaryKeySelective(ViolentLiveMember record);

    int updateByPrimaryKey(ViolentLiveMember record);
}