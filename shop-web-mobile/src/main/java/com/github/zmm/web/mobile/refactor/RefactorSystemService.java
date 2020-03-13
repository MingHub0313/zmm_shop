package com.github.zmm.web.mobile.refactor;

import com.github.zmm.service.system.api.service.SystemService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Name RefactorSystemService
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@FeignClient("system-service")
public interface RefactorSystemService extends SystemService {
}
