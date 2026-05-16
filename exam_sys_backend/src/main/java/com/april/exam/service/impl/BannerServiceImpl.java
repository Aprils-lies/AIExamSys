package com.april.exam.service.impl;

import com.april.exam.entity.Banner;
import com.april.exam.mapper.BannerMapper;
import com.april.exam.service.BannerService;

import com.april.exam.service.FileUploadService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


/**
 * 轮播图服务实现类
 */
@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements BannerService {

    @Autowired
    private FileUploadService fileUploadService;

    /**
     * 轮播图上传
     *
     * @param file
     * @return
     */
    @Override
    public String uploadBannerImage(MultipartFile file) throws Exception {
        if (file.isEmpty()) {
            throw new RuntimeException("上传轮播图文件为空！上传失败！");
        }
        //2.格式校验
        if (!file.getContentType().startsWith("image")){
            throw new RuntimeException("上传轮播图图片失败！原因：上传的文件类型错误,非图片！");
        }
        //3.调用核心业务
        String url = fileUploadService.uploadFile("banners", file);
        //4.返回地址
        return url;
    }
}