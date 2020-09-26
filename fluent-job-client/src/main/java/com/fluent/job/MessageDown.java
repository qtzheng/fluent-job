package com.fluent.job;

import com.alibaba.cola.dto.SingleResponse;
import com.fluent.job.domain.message.*;

public interface MessageDown {
    /**
     * 执行任务
     * @param message 执行参数
     * @return 结果
     */
    SingleResponse<String> execute(Message<ExecuteBody> message);
    /**
     * 强制结束任务
     * @param message 参数
     * @return 结果
     */
    SingleResponse<String> kill(Message<KillBody> message);
    /**
     * 暂停任务
     * @param message 参数
     * @return 结果
     */
    SingleResponse<String> suspend(Message<SuspendBody> message);
    /**
     * 恢复暂停的任务
     * @param message 参数
     * @return 结果
     */
    SingleResponse<String> recovery(Message<RecoveryBody> message);
}
