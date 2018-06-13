package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.UserAuthenticate;
import com.leyuan.jiang.pojo.po.UserAuthenticateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthenticateMapper {
    int countByExample(UserAuthenticateExample example);

    int deleteByExample(UserAuthenticateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAuthenticate record);

    int insertSelective(UserAuthenticate record);

    List<UserAuthenticate> selectByExample(UserAuthenticateExample example);

    UserAuthenticate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAuthenticate record, @Param("example") UserAuthenticateExample example);

    int updateByExample(@Param("record") UserAuthenticate record, @Param("example") UserAuthenticateExample example);

    int updateByPrimaryKeySelective(UserAuthenticate record);

    int updateByPrimaryKey(UserAuthenticate record);
}