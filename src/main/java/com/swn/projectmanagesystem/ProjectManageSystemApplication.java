package com.swn.projectmanagesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@MapperScan(value ="com.swn.projectmanagesystem.user.dao")
@SpringBootApplication
public class ProjectManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectManageSystemApplication.class, args);
    }

}
