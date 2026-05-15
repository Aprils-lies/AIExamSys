package com.april.exam.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 四月是你的谎言
 * @CreateTime: 2026/5/15 15:20
 * Description:
 */

@Configuration
@MapperScan("com.april.exam.mapper")
public class MybatisPlusConfiguration {

}