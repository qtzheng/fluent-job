package com.fluent.job.domain.message;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ExecuteBody extends MessageBody {
    private String jobId;

    private String executorHandler;
    private String executorParams;
    private String executorBlockStrategy;
    private int executorTimeout;

    private String logId;
    private long logDateTime;

    private String glueType;
    private String glueSource;
    private long glueUpdatetime;

    private int broadcastIndex;
    private int broadcastTotal;
}
