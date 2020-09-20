package com.fluent.job;

import com.alibaba.cola.dto.Command;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(of = "commandId", callSuper = false)
@Data
public class SchedulerCommand extends Command {
    private String commandId;
    private CommandType commandType;
    private String executerId;
    private CommandParam commandParam;

    public SchedulerCommand(CommandType commandType, String executerId, CommandParam commandParam) {
        if (!commandType.checkParam(commandParam)) {
            throw new IllegalArgumentException(String.format("CommandParam require %s", commandType.getClass().getName()));
        }
        this.commandId = UUID.randomUUID().toString().replace("-", "");
        this.commandType = commandType;
        this.executerId = executerId;
        this.commandParam = commandParam;
    }

    public enum CommandType {
        /**
         * 执行任务
         */
        EXECUTE(10, ExecuteParam.class),
        /**
         * 恢复暂停的任务
         */
        RESUME(11, ExecuteParam.class),
        /**
         * 强制结束任务
         */
        KILL(20, ExecuteParam.class),
        /**
         * 暂停正在执行的任务
         */
        SUSPEND(21, ExecuteParam.class),
        ;

        private final int type;
        private final Class<? extends CommandParam> cmdClass;

        CommandType(int type, Class<? extends CommandParam> cmdClass) {
            this.type = type;
            this.cmdClass = cmdClass;
        }

        public boolean checkParam(CommandParam param) {
            return param != null && param.getClass() == cmdClass;
        }
    }
}
