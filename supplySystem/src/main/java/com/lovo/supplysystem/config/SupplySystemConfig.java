package com.lovo.supplysystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 常规配置类
 */
//@Configuration
public class SupplySystemConfig {

    //手动装载远程调用模板
//    @Bean(value = "restTemplate")
//    @LoadBalanced  //负载均衡
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
