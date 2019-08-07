package com.jk.zcl.controller;

import com.jk.zcl.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 赵成林
 * @Date 2019/8/6 13:08
 */
@RestController
public class TestController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String test(@RequestParam String name){
        return helloService.getName(name);
    }
}
