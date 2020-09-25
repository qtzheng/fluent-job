package com.fluent.job.controller;

import com.alibaba.cola.dto.SingleResponse;
import com.fluent.job.ExecuteParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郑乾通
 * @description
 * @date 2020/9/25
 */
@RestController
@RequestMapping("/api/v1")
public class CloudApiController {

    @PostMapping("/registry")
    public SingleResponse<String> registry(@RequestBody() ExecuteParam param){
        return SingleResponse.buildSuccess();
    }

    @PostMapping("/callback")
    public SingleResponse<String> callback(@RequestBody() ExecuteParam param){
        return SingleResponse.buildSuccess();
    }

    @PostMapping("/registryRemove")
    public SingleResponse<String> registryRemove(@RequestBody() ExecuteParam param){
        return SingleResponse.buildSuccess();
    }
}
