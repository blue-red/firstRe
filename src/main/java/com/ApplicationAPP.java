package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jack.wang on 2017/6/20.
 */

@SpringBootApplication
@MapperScan("com.text.spring.boot.mapper")
public class ApplicationAPP {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationAPP.class, args);
    }
}
