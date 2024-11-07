package com.example;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Param;

/**
 * @author BNTang
 * @version 1.0
 * @description 用于演示的控制器
 * @since 2024/11/7 星期四
 **/
@Controller
public class DemoController {
    @Mapping("/hello")
    public String hello(@Param(defaultValue = "world") String name) {
        return String.format("Hello %s!", name);
    }
}
