package com.github.zmm.service.message;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Name MessageServiceApplication
 * @Author 900045
 * @Created by 2020/3/13 0013
 */

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.github.zmm")
@MapperScan("com.github.zmm.service.message.dao")
public class MessageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageServiceApplication.class, args);
	}
}
