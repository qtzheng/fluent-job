package com.fluent.job.manager;

import com.fluent.job.handler.JobHandler;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class JobManager {
    /**
     * 任务处理器仓库，每种任务只有一个处理器
     * jobProcessorRepository = ConcurrentMap<任务ID, 处理器实力>
     */
    private static ConcurrentMap<String, JobHandlerExecuter> jobProcessorRepository = new ConcurrentHashMap<>();

    private JobManager(){}

    /**
     *
     * @param jobId
     * @param jobHandler
     * @param removeOldReason
     */
    public static JobHandlerExecuter registJob(String jobId,JobHandler jobHandler,String removeOldReason){

        JobHandlerExecuter executer=new JobHandlerExecuter(jobId,jobHandler);
        executer.start();

        JobHandlerExecuter oldExecuter= jobProcessorRepository.put(jobId,executer);
        if (oldExecuter!=null){
            oldExecuter.toStop(removeOldReason);
            oldExecuter.interrupt();
        }
        return executer;
    }

    public static JobHandlerExecuter removeJob(String jobId,String removeOldReason){
        JobHandlerExecuter executer=jobProcessorRepository.remove(jobId);
        if (executer!=null){
            executer.toStop(removeOldReason);
            executer.interrupt();
            return executer;
        }
        return null;
    }
    public static JobHandlerExecuter loadJobThread(int jobId){
        JobHandlerExecuter jobThread = jobProcessorRepository.get(jobId);
        return jobThread;
    }
}
