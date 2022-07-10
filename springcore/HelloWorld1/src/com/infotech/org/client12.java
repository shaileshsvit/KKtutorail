package com.infotech.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message2;


public class client12 {
	
	public static void main(String[] args) {

		
AbstractApplicationContext app=new ClassPathXmlApplicationContext("Beans12.xml");
Message2 m=app.getBean("message",Message2.class);

System.out.println(m.getMessage()+"\t"+m.getMessageId());
app.close();
	}
}