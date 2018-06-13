package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.ConsoleUser;
import com.leyuan.jiang.pojo.po.ConsoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsoleUserMapper {
    int countByExample(ConsoleUserExample example);

    int deleteByExample(ConsoleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConsoleUser record);

    int insertSelective(ConsoleUser record);

    List<ConsoleUser> selectByExample(ConsoleUserExample example);

    ConsoleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConsoleUser record, @Param("example") ConsoleUserExample example);

    int updateByExample(@Param("record") ConsoleUser record, @Param("example") ConsoleUserExample example);

    int updateByPrimaryKeySelective(ConsoleUser record);

    int updateByPrimaryKey(ConsoleUser record);

    List<ConsoleUser> getData();
}