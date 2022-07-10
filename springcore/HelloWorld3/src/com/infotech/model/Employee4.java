package com.infotech.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee4 {

	private int employeeId;
	private String employeeName;
	
	@Autowired
	@Qualifier("pancard2")
	private Pancard pancard;
	
	
	


	public Pancard getPancard() {
		return pancard;
	}
	
	
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}