package com.infotech.org;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message;


public class client15 {
	
	public static void main(String[] args) {

AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans15.xml");
		
		Message message = ctx.getBean("message", Message.class);
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		ctx.close();	}
	}