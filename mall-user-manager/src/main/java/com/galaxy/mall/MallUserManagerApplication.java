package com.galaxy.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.galaxy.mall.usermanage.mapper")
public class MallUserManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallUserManagerApplication.class, args);
    }

}
