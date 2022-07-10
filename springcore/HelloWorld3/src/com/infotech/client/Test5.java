package com.infotech.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.*;

public class Test5 {
	public static void main(String[] args) {

ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans5.xml");
		
		Employee4 employee = ctx.getBean("employee", Employee4.class);
		
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
		
		System.out.println("-----------------------------");
		Pancard  pancard = employee.getPancard();
		if(pancard != null)
		System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
		else
			System.out.println("Pancard info is not available...");
		((AbstractApplicationContext) ctx).close();
	}

}