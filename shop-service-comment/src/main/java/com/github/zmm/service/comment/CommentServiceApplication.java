package com.github.zmm.service.comment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Name CommentServiceApplication
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.github.zmm.service.comment.dao")
public class CommentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentServiceApplication.class, args);
	}
}
