package com.jk.zcl.service;

import com.jk.zcl.service.impl.TestServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author 赵成林
 * @Date 2019/8/6 13:47
 */
//FeignClient指定接口要使用的服务
@FeignClient(value="SERVICE-HI",fallback = TestServiceHystric.class)
public interface TestService {

    //必须加RequestParam注解不然无法传值
    @RequestMapping("hello")
    String getName(@RequestParam(value = "name") String name);
}
