package com.github.zmm.service.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Name com.github.zmm.service.rabbitmq.RabbitMQApplication
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.github.zmm")
public class RabbitMQApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMQApplication.class, args);
	}

}
