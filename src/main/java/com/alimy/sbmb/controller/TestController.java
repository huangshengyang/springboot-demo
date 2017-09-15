package com.alimy.sbmb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 * 
 * @author huangshengyang
 *
 */
@RestController
public class TestController {

    @RequestMapping(value = "/hw")
    public String test() {
        return "Hello World!";
    }

    public void aa() {

    }
}
