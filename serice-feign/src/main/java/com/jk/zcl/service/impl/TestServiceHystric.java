package com.jk.zcl.service.impl;

import com.jk.zcl.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestServiceHystric
 * @Description TODO
 * @Author 赵成林
 * @Date 2019/8/6 14:22
 */
@Component
public class TestServiceHystric implements TestService {
    @Override
    public String getName(String name) {
        return "sorry 500";
    }
}
