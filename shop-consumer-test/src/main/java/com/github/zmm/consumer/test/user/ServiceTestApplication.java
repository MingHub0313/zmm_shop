package com.github.zmm.consumer.test.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Name ServiceTestApplication
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTestApplication.class, args);
	}
}
