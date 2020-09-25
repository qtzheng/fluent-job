package com.fluent.job;

import com.alibaba.cola.dto.SingleResponse;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 郑乾通
 * 2020/9/25
 *
 * 上行消息:执行器--->调度器
 */
public interface MessageUp {
    /**
     * 执行器注册（附带心跳检查）。
     * 每隔30秒向调度器发送注册命令，调度器接收到消息后新增执行器记录或者修改注册时间。
     * @param param 执行参数
     * @return 结果
     */
    SingleResponse<String> registry(ExecuteParam param);
    /**
     * 任务结束，回调，返回执行结果。
     * @param param 参数
     * @return 结果
     */
    SingleResponse<String> callback(ExecuteParam param);
    /**
     * 执行器下线，移除注册信息。
     * @param param 参数
     * @return 结果
     */
    SingleResponse<String> registryRemove(ExecuteParam param);
}
