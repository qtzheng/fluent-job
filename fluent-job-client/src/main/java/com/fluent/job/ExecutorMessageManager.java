package com.fluent.job;

import com.alibaba.cola.dto.SingleResponse;
import org.springframework.stereotype.Component;

/**
 * @author 郑乾通
 * @description
 * @date 2020/9/25
 */
@Component
public class ExecutorMessageManager implements MessageDown,MessageUp {

    /**
     * 执行任务
     *
     * @param param 执行参数
     * @return 结果
     */
    @Override
    public SingleResponse<String> execute(ExecuteParam param) {
        return null;
    }

    /**
     * 强制结束任务
     *
     * @param param 参数
     * @return 结果
     */
    @Override
    public SingleResponse<String> kill(ExecuteParam param) {
        return null;
    }

    /**
     * 暂停任务
     *
     * @param param 参数
     * @return 结果
     */
    @Override
    public SingleResponse<String> suspend(ExecuteParam param) {
        return null;
    }

    /**
     * 恢复暂停的任务
     *
     * @param param 参数
     * @return 结果
     */
    @Override
    public SingleResponse<String> recovery(ExecuteParam param) {
        return null;
    }

    /**
     * 执行器注册（附带心跳检查）。
     * 每隔30秒向调度器发送注册命令，调度器接收到消息后新增执行器记录或者修改注册时间。
     *
     * @param param 执行参数
     * @return 结果
     */
    @Override
    public SingleResponse<String> registry(ExecuteParam param) {
        return null;
    }

    /**
     * 任务结束，回调，返回执行结果。
     *
     * @param param 参数
     * @return 结果
     */
    @Override
    public SingleResponse<String> callback(ExecuteParam param) {
        return null;
    }

    /**
     * 执行器下线，移除注册信息。
     *
     * @param param 参数
     * @return 结果
     */
    @Override
    public SingleResponse<String> registryRemove(ExecuteParam param) {
        return null;
    }
}
