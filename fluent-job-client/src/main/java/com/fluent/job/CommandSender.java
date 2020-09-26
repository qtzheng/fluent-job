package com.fluent.job;

import com.alibaba.cola.dto.SingleResponse;

public interface CommandSender {
    /**
     * beat
     * @return
     */
    public SingleResponse<String> beat();

    /**
     * idle beat
     *
     * @param idleBeatParam
     * @return
     */
    public SingleResponse<String> idleBeat(IdleBeatParam idleBeatParam);

    /**
     * execute
     * @param executeParam
     * @return
     */
    public SingleResponse<String> execute(ExecuteParam executeParam);

    /**
     * kill
     * @param killParam
     * @return
     */
    public SingleResponse<String> kill(KillParam killParam);

}
