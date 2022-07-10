package com.infotech.org;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee2;

public class client9 {
	
	public static void main(String[] args) {

AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("Beans8.xml");
		
		Employee2 employee = ctx.getBean("employee", Employee2.class);
		
		System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getGender()+"\t"+employee.getPanNo());
		
		ctx.close();
	}

}