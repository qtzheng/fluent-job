package com.fluent.job.thread;

import com.fluent.job.domain.message.CallbackBody;
import com.fluent.job.domain.message.Message;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.LinkedBlockingQueue;

@Slf4j
public class ExecutorCallbackThread {
    private static ExecutorCallbackThread instance = new ExecutorCallbackThread();

    public static ExecutorCallbackThread getInstance() {
        return instance;
    }

    private LinkedBlockingQueue<Message<CallbackBody>> callbackQueue = new LinkedBlockingQueue<>();

    /**
     * 回调消息，推送到队列中
     * @param callbackBody
     */
    public static void pushCallback(CallbackBody callbackBody){
        Message<CallbackBody> message=new Message<>(callbackBody);
        getInstance().callbackQueue.add(message);
        log.debug(">>>>>>>>>>> fluent-job,push callback body:{}",callbackBody);
    }

    /**
     * callback thread
     */
    private Thread triggerCallbackThread;
    private Thread triggerRetryCallbackThread;
    private volatile boolean toStop = false;

    public void start(){
        triggerCallbackThread=new Thread(new Runnable() {
            @Override
            public void run() {
                while (toStop){
                    try {
                        Message<CallbackBody> message=getInstance().callbackQueue.take();
                        if (message!=null){

                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
    private void doCallback(Message<CallbackBody> message){
        boolean callbackResult=false;

    }
}
