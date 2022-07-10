package com.infotech.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee4;
import com.infotech.model.Pancard;

public class Test3 {
	public static void main(String[] args) {


ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans3.xml");
		
		Employee4 employee = ctx.getBean("employee", Employee4.class);
		
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
		
		System.out.println("-----------------------------");
		Pancard pancard = employee.getPancard();
		if(pancard != null)
		System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
		else
			System.out.println("Pancard info is not available...");
		((AbstractApplicationContext) ctx).close();
	}

}