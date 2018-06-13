package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.UserGkalThumb;
import com.leyuan.jiang.pojo.po.UserGkalThumbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGkalThumbMapper {
    int countByExample(UserGkalThumbExample example);

    int deleteByExample(UserGkalThumbExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserGkalThumb record);

    int insertSelective(UserGkalThumb record);

    List<UserGkalThumb> selectByExample(UserGkalThumbExample example);

    UserGkalThumb selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserGkalThumb record, @Param("example") UserGkalThumbExample example);

    int updateByExample(@Param("record") UserGkalThumb record, @Param("example") UserGkalThumbExample example);

    int updateByPrimaryKeySelective(UserGkalThumb record);

    int updateByPrimaryKey(UserGkalThumb record);
}