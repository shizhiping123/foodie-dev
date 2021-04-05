package com.imooc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public Object hello(){
        return "hello world~张三~史志平~5522111222255556666111222";
    }
}
