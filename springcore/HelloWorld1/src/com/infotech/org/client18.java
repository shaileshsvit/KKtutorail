package com.infotech.org;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.info.CompanyInfo;
import com.infotech.model.Student;


public class client18 {
	
	public static void main(String[] args) {

ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans19.xml");
		
		CompanyInfo companyInfo = ctx.getBean("companyInfo", CompanyInfo.class);
		
		Map<Integer, String> empIdAndNameMap = companyInfo.getEmpIdAndNameMap();
		
		Set<Entry<Integer, String>> entrySet = empIdAndNameMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		System.out.println("------------------------------------------------");
		
		Map<Integer, Student> studentIdMap = companyInfo.getStudentIdMap();
		Set<Entry<Integer, Student>> entrySet2 = studentIdMap.entrySet();
		for (Entry<Integer, Student> entry : entrySet2) {
			
			System.out.println(entry.getKey());
			Student student = entry.getValue();
			
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getEmail());
			
		}
		((AbstractApplicationContext) ctx).close();
	}
	}