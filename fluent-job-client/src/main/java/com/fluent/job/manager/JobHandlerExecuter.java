package com.fluent.job.manager;

import com.alibaba.cola.dto.Response;
import com.fluent.job.domain.message.ExecuteBody;
import com.fluent.job.handler.JobHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 任务执行器
 */
@Slf4j
public class JobHandlerExecuter extends Thread {
    private String jobId;
    private JobHandler jobHandler;
    private LinkedBlockingQueue<ExecuteBody> blockingQueue;
    private Set<String> logIdSet;
    private volatile boolean toStop = false;
    private String stopReason;

    private boolean running = false;
    private int idleTimes = 0;

    public JobHandlerExecuter(String jobId, JobHandler jobHandler) {
        this.jobId = jobId;
        this.jobHandler = jobHandler;
        this.blockingQueue = new LinkedBlockingQueue<>();
        this.logIdSet = Collections.synchronizedSet(new HashSet<>());
    }

    @Override
    public void run() {

    }

    public void toStop(String stopReason) {
        /**
         * Thread.interrupt只支持终止线程的阻塞状态(wait、join、sleep)，
         * 在阻塞出抛出InterruptedException异常,但是并不会终止运行的线程本身；
         * 所以需要注意，此处彻底销毁本线程，需要通过共享变量方式；
         */
        this.toStop = true;
        this.stopReason = stopReason;
    }


    public JobHandler getJobHandler() {
        return jobHandler;
    }

    public Response pushJob(ExecuteBody executeBody){
        if (logIdSet.contains(executeBody.getLogId())){
            return Response.buildFailure("500","已经存在本次任务");
        }
        logIdSet.add(executeBody.getLogId());
        blockingQueue.add(executeBody);
        return Response.buildSuccess();
    }
}
