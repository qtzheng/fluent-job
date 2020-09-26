package com.fluent.job;

import com.alibaba.cola.dto.SingleResponse;
import com.fluent.job.domain.message.*;
import org.springframework.stereotype.Component;

/**
 * @author 郑乾通
 * @description
 * @date 2020/9/25
 */
@Component
public class CloudMessageManager implements MessageDown,MessageUp {

    @Override
    public SingleResponse<String> execute(Message<ExecuteBody> message) {
        return null;
    }

    @Override
    public SingleResponse<String> kill(Message<KillBody> message) {
        return null;
    }

    @Override
    public SingleResponse<String> suspend(Message<SuspendBody> message) {
        return null;
    }

    @Override
    public SingleResponse<String> recovery(Message<RecoveryBody> message) {
        return null;
    }

    @Override
    public SingleResponse<String> registry(Message<RegistryBody> message) {
        return null;
    }

    @Override
    public SingleResponse<String> callback(Message<RegistryBody> message) {
        return null;
    }

    @Override
    public SingleResponse<String> registryRemove(Message<RegistryRemoveBody> message) {
        return null;
    }
}
