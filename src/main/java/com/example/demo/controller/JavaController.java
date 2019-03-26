package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tuo
 * @create 2019-03-26 下午 12:43
 */
@RestController
public class JavaController {

    @GetMapping(value = "test")
    public String test(){
        return "这是一个测试demo111";
    }
}
