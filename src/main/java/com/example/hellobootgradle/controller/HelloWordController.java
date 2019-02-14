package com.example.hellobootgradle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    private static final Logger log = LoggerFactory.getLogger(HelloWordController.class);
    @GetMapping("/hello")
    public String hello(){
        if(log.isDebugEnabled()){

            log.debug("进入了HelloWord方法");
        }
        System.out.println("好像又不行了");//直接字符串还不会重启。。。
        System.out.println("重启吧");
        return "Hello Word gradle";
    }
}
