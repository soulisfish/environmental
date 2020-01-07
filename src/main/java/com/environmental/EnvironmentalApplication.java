package com.environmental;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.environmental.utils")
@MapperScan("com.environmental.dao")
@EnableScheduling
public class EnvironmentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnvironmentalApplication.class, args);
    }

}
