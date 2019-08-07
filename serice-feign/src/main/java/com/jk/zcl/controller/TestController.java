package com.jk.zcl.controller;

import com.jk.zcl.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 赵成林
 * @Date 2019/8/6 13:45
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/hi")
    public String hello(String name){
        System.out.println(name);
        return testService.getName(name);

    }
}
