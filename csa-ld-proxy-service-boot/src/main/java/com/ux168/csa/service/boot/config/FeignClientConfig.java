package com.ux168.csa.service.boot.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Description feign配置
 *
 * @author zhangyinxing
 * @since 2024/5/10
 **/
@Configuration
                                   // 扫描平台jar包中的feignClient， // 扫描本工程中的feignClient
@EnableFeignClients(basePackages = {"com.ux168.platform", "com.ux168.csa.service.biz"})
public class FeignClientConfig {
}
