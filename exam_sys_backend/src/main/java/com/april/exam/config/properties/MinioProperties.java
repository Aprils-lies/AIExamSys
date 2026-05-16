package com.april.exam.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: 四月是你的谎言
 * @CreateTime: 2026/5/15 16:56
 * Description: 读取application中的minio的参数配置
 */

@Data
@Component
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    //    端点 minio.endpoint  账号 minio.username 密码 minio.password  桶名 mimio.bucket-name
    private String endpoint;
    private String accessKey;
    private String secretKey;
    // @Value() //依赖注入！ 非引用类型！
    private String bucketName;

}
