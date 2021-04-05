package com.imooc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {


    @GetMapping("/hello")
    public Object hello(){
        return "123_456_789_000_111";
    }
}
