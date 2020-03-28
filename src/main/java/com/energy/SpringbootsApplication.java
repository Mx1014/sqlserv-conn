package com.energy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.energy.dao")
public class SpringbootsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsApplication.class, args);
    }
}
