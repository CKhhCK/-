package com.chenke.schoolmanger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/chenke/schoolmanger/dao")
public class SchoolMangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolMangerApplication.class, args);
    }

}
