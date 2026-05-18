package com.april.exam.service;

import com.april.exam.dto.AiGenerateRequestDto;
import com.april.exam.dto.QuestionImportDto;

import java.util.List;

/**
 * deepseek AI服务接口
 * 用于调用deepseek API生成题目
 */
public interface DeepseekAiService {
    
    /**
     * 根据要求生成题目
     * @param request AI生成请求参数
     * @return 生成的题目列表
     */
    List<QuestionImportDto> generateQuestions(AiGenerateRequestDto request);
} 