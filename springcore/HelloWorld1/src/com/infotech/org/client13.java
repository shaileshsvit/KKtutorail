package com.infotech.org;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message3;


public class client13 {
	
	public static void main(String[] args) {

		
AbstractApplicationContext app=new ClassPathXmlApplicationContext("Beans13.xml");
Message3 m=app.getBean("message",Message3.class);

System.out.println(m.getMessage()+"\t"+m.getMessageId());
app.close();
	}
}