package com.jk.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 赵成林
 * @Date 2019/8/6 10:54
 */
@EnableEurekaClient
@RestController
public class TestController {
    @Value("${server.port}")
    private String name2;
    @RequestMapping("/hello")
    public String Test(String name){
        return name2+name;
    }
}
