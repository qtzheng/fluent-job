package com.fluent.job.manager;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class JobManager {
    /**
     * 任务处理器仓库，每种任务只有一个处理器
     * jobProcessorRepository = ConcurrentMap<任务ID, 处理器实力>
     */
    private static ConcurrentMap<String, JobHandlerExecute> jobProcessorRepository = new ConcurrentHashMap<>();

    private JobManager(){}

    public void addJob(){
    }
}
