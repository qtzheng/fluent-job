package com.fluent.job;

import com.alibaba.cola.dto.SingleResponse;

public interface MessageDown {
    /**
     * 执行任务
     * @param param 执行参数
     * @return 结果
     */
    SingleResponse<String> execute(ExecuteParam param);
    /**
     * 强制结束任务
     * @param param 参数
     * @return 结果
     */
    SingleResponse<String> kill(ExecuteParam param);
    /**
     * 暂停任务
     * @param param 参数
     * @return 结果
     */
    SingleResponse<String> suspend(ExecuteParam param);
    /**
     * 恢复暂停的任务
     * @param param 参数
     * @return 结果
     */
    SingleResponse<String> recovery(ExecuteParam param);
}
