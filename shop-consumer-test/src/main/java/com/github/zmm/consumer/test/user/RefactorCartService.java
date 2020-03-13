package com.github.zmm.consumer.test.user;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Name RefactorCartService
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@FeignClient("cart-service")
public interface RefactorCartService {
}
