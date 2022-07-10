package com.infotech.org;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.service.Communication;

public class client7 {
	
	public static void main(String[] args) {

		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("Beans7.xml");
		
		Communication communication = ctx.getBean("communication", Communication.class);
		
		communication.comminicate();
		
		ctx.close();
	}

}