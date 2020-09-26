package com.fluent.job.handler;

import com.alibaba.cola.dto.SingleResponse;

import java.lang.reflect.InvocationTargetException;

public abstract class JobHandler {
    /** success */
    public static final SingleResponse<String> SUCCESS = SingleResponse.buildSuccess();
    /** fail */
    public static final SingleResponse<String> FAIL = SingleResponse.buildFailure("500", "执行失败！");
    /** fail timeout */
    public static final SingleResponse<String> FAIL_TIMEOUT = SingleResponse.buildFailure("502", "执行超时");

    /**
     * 执行任务
     * @param param
     * @return
     * @throws Exception
     */
    public abstract SingleResponse<String> execute(String param) throws Exception;

    public void init() throws InvocationTargetException, IllegalAccessException {
        // do something
    }

    public void destroy() throws InvocationTargetException, IllegalAccessException {
        // do something
    }
}
