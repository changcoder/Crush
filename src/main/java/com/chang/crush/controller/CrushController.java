package com.chang.crush.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrushController {

    @Value("${com.chang.crush.name}")
    private String crushName;
    @Value("${com.chang.crush.desc}")
    private String crushDesc;
    @Value("${com.chang.crush.random}")
    private String crushRandom;


    @RequestMapping("/hello")
    public String hello() {
        System.out.println(crushName);
        System.out.println(crushDesc);
        System.out.println(crushRandom);
        return "hello";
    }

    @RequestMapping("/errorExcept")
    public String error() throws Exception {
        throw new Exception("同一处理异常");
    }
}
