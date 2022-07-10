package com.infotech.model;


import org.springframework.beans.factory.annotation.Autowired;

public class Employee2 {

	private int employeeId;
	private String employeeName;
	

	private Pancard pancard;

	public Pancard getPancard() {
		return pancard;
	}
	
	@Autowired(required=false)
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