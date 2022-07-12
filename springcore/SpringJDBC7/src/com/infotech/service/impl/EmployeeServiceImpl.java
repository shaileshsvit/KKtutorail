package com.infotech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.dao.EmployeeDao;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public Employee fetchEmployeeNamAndSalaryById(int employeeId) {
		return employeeDao.getEmployeeNamAndSalaryById(employeeId);
	}

}
