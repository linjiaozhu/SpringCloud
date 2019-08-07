package com.jk.zcl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description TODO
 * @Author 赵成林
 * @Date 2019/8/7 13:32
 */
@RestController
public class ConfigController {
    @Value("${foo}")
    String foo;
    @RequestMapping("/hi")
    public String  test(){
        return foo;
    }
}
