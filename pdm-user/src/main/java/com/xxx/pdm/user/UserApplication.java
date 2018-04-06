package com.xxx.pdm.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhou
 */
@SpringBootApplication
@MapperScan("com.xxx.pdm.user.mapping")
@EnableDiscoveryClient
public class UserApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApplication.class, args);
    }
}
