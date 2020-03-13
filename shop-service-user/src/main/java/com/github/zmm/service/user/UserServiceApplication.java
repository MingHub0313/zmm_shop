package com.github.zmm.service.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Name UserServiceApplication
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.github.zmm.service.user.dao")
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
