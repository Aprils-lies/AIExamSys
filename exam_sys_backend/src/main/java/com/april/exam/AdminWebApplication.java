package com.april.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 四月是你的谎言
 * @CreateTime: 2026/5/15 15:19
 * Description:
 */

@SpringBootApplication
public class AdminWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminWebApplication.class, args);
        System.out.println("项目启动了");
    }
}
