package com.github.zmm.service.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Name OrderServiceApplication
 * @Author 900045
 * @Created by 2020/3/13 0013
 */

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.github.zmm.service.order.dao")
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
}
