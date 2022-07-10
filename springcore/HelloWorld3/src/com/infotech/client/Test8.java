package com.infotech.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.*;

public class Test8 {
	public static void main(String[] args) {


		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans8.xml");
		
		UserDetails userDetails = ctx.getBean("userBean", UserDetails.class);
		
		System.out.println(userDetails.getUserName()+"\t"+userDetails.getPassword());
		((AbstractApplicationContext) ctx).close();
	}

}