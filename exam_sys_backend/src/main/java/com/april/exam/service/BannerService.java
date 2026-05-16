package com.april.exam.service;

import com.april.exam.entity.Banner;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;

/**
 * 轮播图服务接口
 */
public interface BannerService extends IService<Banner> {

    /**
     * 轮播图上传
     * @param file
     * @return
     */
    public String uploadBannerImage(MultipartFile file) throws Exception;
} 