package com.xxx.pdm.inexp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xxx.pdm.inexp.mapping")
public class InExpApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(InExpApplication.class, args);
	}

}
