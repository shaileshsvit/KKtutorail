package com.infotech.service.impl;

import com.infotech.dao.EmployeeDao;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public Employee fetchEmployeeNamAndSalaryById(int employeeId) {
		return employeeDao.getEmployeeNamAndSalaryById(employeeId);
	}

}
