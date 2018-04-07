package com.xxx.pdm.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhou
 */
@SpringBootApplication
@MapperScan("com.xxx.pdm.user.mapping")
@EnableDiscoveryClient
//@EnableFeignClients
public class UserApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UserApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
