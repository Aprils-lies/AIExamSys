package com.april.exam.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * description: 接收题目分页查询的四个参数
 */
@Data
@Schema(description = "接收分页四个核心参数的Vo")
public class QuestionPageVo {

    private Long categoryId;
    private String difficulty;
    private String type;
    private String keyword;
}
