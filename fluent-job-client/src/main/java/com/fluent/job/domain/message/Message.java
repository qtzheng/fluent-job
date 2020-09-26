package com.fluent.job.domain.message;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode(of = "messageId")
public class Message<T extends MessageBody> {
    private String messageId;
    private T messageBody;
    private String bodyType;
    public Message(T messageBody){
        assert messageBody!=null;
        this.messageId= UUID.randomUUID().toString().replace("-","");
        this.messageBody=messageBody;
        this.bodyType=messageBody.getClass().getName();
    }
}
