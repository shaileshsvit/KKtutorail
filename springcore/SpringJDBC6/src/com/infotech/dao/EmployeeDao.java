package com.infotech.dao;

import java.util.List;

import com.infotech.model.Employee;

public interface EmployeeDao {

	public abstract Employee getEmployeeNamAndSalaryById(int employeeId);
	
	
}