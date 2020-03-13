package com.github.zmm.consumer.test.user;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Name RefactorUserService
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@FeignClient("user-service")
public interface RefactorUserService {
}
