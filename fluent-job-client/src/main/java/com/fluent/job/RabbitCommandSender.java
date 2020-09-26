package com.fluent.job;

import com.alibaba.cola.dto.SingleResponse;

public class RabbitCommandSender implements CommandSender{
    @Override
    public SingleResponse<String> beat() {
        return null;
    }

    @Override
    public SingleResponse<String> idleBeat(IdleBeatParam idleBeatParam) {
        return null;
    }

    @Override
    public SingleResponse<String> execute(ExecuteParam executeParam) {
        return null;
    }

    @Override
    public SingleResponse<String> kill(KillParam killParam) {
        return null;
    }
}
