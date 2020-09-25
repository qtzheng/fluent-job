package com.fluent.job;

import com.alibaba.cola.dto.SingleResponse;
import org.springframework.stereotype.Component;

/**
 * @author 郑乾通
 * @description
 * @date 2020/9/25
 */
@Component
public class CloudMessageManager implements MessageDown,MessageUp {
    @Override
    public SingleResponse<String> execute(ExecuteParam param) {
        return null;
    }

    @Override
    public SingleResponse<String> kill(ExecuteParam param) {
        return null;
    }

    @Override
    public SingleResponse<String> suspend(ExecuteParam param) {
        return null;
    }

    @Override
    public SingleResponse<String> recovery(ExecuteParam param) {
        return null;
    }

    @Override
    public SingleResponse<String> registry(ExecuteParam param) {
        return null;
    }

    @Override
    public SingleResponse<String> callback(ExecuteParam param) {
        return null;
    }

    @Override
    public SingleResponse<String> registryRemove(ExecuteParam param) {
        return null;
    }
}
