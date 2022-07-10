package com.infotech.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Employee5 {

	private int employeeId;
	private String employeeName;
	
	
	@Resource(name="pancard6")
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