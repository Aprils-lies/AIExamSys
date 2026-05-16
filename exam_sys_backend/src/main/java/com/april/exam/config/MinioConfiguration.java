package com.april.exam.config;

import com.april.exam.config.properties.MinioProperties;
import io.minio.MinioClient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 四月是你的谎言
 * @CreateTime: 2026/5/15 16:59
 * Description:
 */

@Slf4j
@Configuration
public class MinioConfiguration {

    @Autowired
    private MinioProperties minioProperties;

    @Bean
    public MinioClient minioClient() {
        MinioClient minioClient = MinioClient.builder().endpoint(minioProperties.getEndpoint())
                .credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey())
                .build();
        log.info("minio 文件服务器连接成功！链接对象信息为：{}", minioClient);
        return minioClient;
    }
}
