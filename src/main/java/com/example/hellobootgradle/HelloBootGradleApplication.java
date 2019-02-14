package com.example.hellobootgradle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.hellobootgradle.dao"})
public class HelloBootGradleApplication {

    public static void main(String[] args) {
        System.out.print("HelloWord 控制台输出");
        SpringApplication.run(HelloBootGradleApplication.class, args);
    }

}

