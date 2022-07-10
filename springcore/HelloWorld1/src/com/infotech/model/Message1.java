package com.infotech.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("m2")
@Scope("prototype")
public class Message1 {
	@Value(value="700")
private int messageId;
	@Value(value="shailesh")
private String message;
public int getMessageId() {
	return messageId;
}
public void setMessageId(int messageId) {
	this.messageId = messageId;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}


}
