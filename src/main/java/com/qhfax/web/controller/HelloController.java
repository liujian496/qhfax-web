package com.qhfax.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${qhfax.app.name}")
    private String appName;

    @RequestMapping("/hello")
    public String sayHello(){
        String str = "Hello, qhfax-web-3, appname=[" + appName + "]";
        return str;
    }
}
