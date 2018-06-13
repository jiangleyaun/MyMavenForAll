package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.LoginCount;
import com.leyuan.jiang.pojo.po.LoginCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginCountMapper {
    int countByExample(LoginCountExample example);

    int deleteByExample(LoginCountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoginCount record);

    int insertSelective(LoginCount record);

    List<LoginCount> selectByExample(LoginCountExample example);

    LoginCount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoginCount record, @Param("example") LoginCountExample example);

    int updateByExample(@Param("record") LoginCount record, @Param("example") LoginCountExample example);

    int updateByPrimaryKeySelective(LoginCount record);

    int updateByPrimaryKey(LoginCount record);
}