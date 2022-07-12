package com.infotech.service.impl;

import java.util.List;

import com.infotech.dao.EmployeeDao;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDAO;

	public void setEmployeeDAO(EmployeeDao employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(employeeId);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployeeById(employeeId);
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployeeEmailById(newEmail, employeeId);
	}

	@Override
	public List<Employee> getAllEmployeesInfo() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployeesDetails();
	}

}
