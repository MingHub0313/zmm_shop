package com.github.zmm.service.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Name ProductServiceApplication
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.github.zmm.service.product.dao")
public class ProductServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
}
