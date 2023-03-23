package com.kekwy.oopt.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.kekwy.oopt.server.mapper")
public class WebApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebApplication.class, args);
    }
}
