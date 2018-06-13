package com.leyuan.jiang.service.impl;

import com.leyuan.jiang.dao.ConsoleUserMapper;
import com.leyuan.jiang.pojo.po.ConsoleUser;
import com.leyuan.jiang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private ConsoleUserMapper dao;
    @Override
    public List<ConsoleUser> getData() {
        return dao.getData();
    }
}
