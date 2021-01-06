package com.song.jeremy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.song.jeremy.mapper")
public class JeremyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeremyApplication.class, args);
    }

}
