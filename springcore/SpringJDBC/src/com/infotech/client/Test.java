package com.infotech.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;
import com.infotech.service.impl.EmployeeServiceImpl;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
	EmployeeService employeeService=ctx.getBean("employeeService",EmployeeServiceImpl.class);
	/*
	 * extracted(employeeService); Employee
	 * emp=employeeService.fetchEmployeeById(2);
	 * System.out.println(emp.getEmployeeId()+"\t"+emp.getEmail()); List<Employee>
	 * list=employeeService.getAllEmployeesInfo(); for(Employee e:list)
	 * System.out.println(e.getEmployeeId());
	 */
	employeeService.updateEmployeeEmailById("sha@gmail.com", 9);
	Employee emp=employeeService.fetchEmployeeById(9);
	System.out.println(emp.getEmail());
	//employeeService.deleteEmployeeById(2);
	ctx.close();
}

private static void extracted(EmployeeService employeeService) {
	Employee employee=new Employee();
	employee.setEmployeeName("shailesh sharma");
	employee.setEmail("s@gmail.com");
	employee.setGender("Male");
	employee.setSalary(5000.00);
	employeeService.addEmployee(employee);
}
}
