package com.leyuan.jiang.web;


import com.leyuan.jiang.pojo.po.ConsoleUser;
import com.leyuan.jiang.service.TestService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "testController")
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = "getData",method = RequestMethod.GET)
    public String getData(){

        List<ConsoleUser> users = testService.getData();

        JSONObject json = new JSONObject();
        json.put("name","9999999999");
        json.put("users",users);



        return json.toString();
    }


}
