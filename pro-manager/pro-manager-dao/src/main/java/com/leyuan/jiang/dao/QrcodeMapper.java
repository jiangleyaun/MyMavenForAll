package com.leyuan.jiang.dao;

import com.leyuan.jiang.pojo.po.Qrcode;
import com.leyuan.jiang.pojo.po.QrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrcodeMapper {
    int countByExample(QrcodeExample example);

    int deleteByExample(QrcodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Qrcode record);

    int insertSelective(Qrcode record);

    List<Qrcode> selectByExample(QrcodeExample example);

    Qrcode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Qrcode record, @Param("example") QrcodeExample example);

    int updateByExample(@Param("record") Qrcode record, @Param("example") QrcodeExample example);

    int updateByPrimaryKeySelective(Qrcode record);

    int updateByPrimaryKey(Qrcode record);
}