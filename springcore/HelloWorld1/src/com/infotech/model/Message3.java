package com.infotech.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Message3  {
	
private int messageId;

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
public void D()  {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
System.out.println("After init 2");	
}
public void I() {
	// TODO Auto-generated method stub
System.out.println("Before init2");	
}


}
