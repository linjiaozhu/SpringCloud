package com.jk.zcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author 赵成林
 * @Date 2019/8/6 13:05
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String getName(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hello?name="+name,String.class);
    }
}
