package com.github.zmm.service.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Name CartServiceApplication
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.github.zmm.service")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
	}
}
