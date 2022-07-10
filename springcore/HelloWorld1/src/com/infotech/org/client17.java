package com.infotech.org;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.info.OrgInfo;
import com.infotech.model.Student;


public class client17 {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans17.xml");
		
		OrgInfo orgInfo = ctx.getBean("orgInfo", OrgInfo.class);
		
		Student[] stuArr = orgInfo.getStuArr();
		for (Student student : stuArr) {
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getEmail()+"\t"+student.getGender());
		}
		
		System.out.println("------------------------------------------------");
		List<Student> stuList = orgInfo.getStuList();
		for (Student student : stuList) {
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getEmail()+"\t"+student.getGender());
		}
		System.out.println("------------------------------------------------");
		
		Set<Student> stuSets = orgInfo.getStuSets();
		
		for (Student student : stuSets) {
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getEmail()+"\t"+student.getGender());
		}
		
		((AbstractApplicationContext) ctx).close();
	}
	
	}