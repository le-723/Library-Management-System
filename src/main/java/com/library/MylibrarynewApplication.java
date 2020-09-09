package com.library;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages = "com.library.mapper")
public class MylibrarynewApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MylibrarynewApplication.class, args);
    }

    //好像是解决找不到jsp文件
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MylibrarynewApplication.class);
    }
}
