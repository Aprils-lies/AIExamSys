package com.april.exam.config;

/**
 * @Author: 四月是你的谎言
 * @CreateTime: 2026/5/18 19:59
 * Description:
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 应用配置类
 */
@Configuration
public class AppConfig {

    /**
     * 将RestTemplate注册为Bean，用于发送HTTP请求
     * @return RestTemplate实例
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate(); // 创建并返回RestTemplate实例
    }
}
