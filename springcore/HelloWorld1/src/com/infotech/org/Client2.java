package com.infotech.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.infotech.model.Employee1;
import com.infotech.model.Message1;

public class Client2 {


		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ApplicationContext app=new ClassPathXmlApplicationContext("Beans3.xml");
		Message1 m=app.getBean("message",Message1.class);
		m.setMessage("hello");
		m.setMessageId(102);
		System.out.println(m.getMessage()+"\t"+m.getMessageId());
		Message1 m1=app.getBean("message",Message1.class);
		
		System.out.println(m1.getMessage()+"\t"+m1.getMessageId());
		}


}
