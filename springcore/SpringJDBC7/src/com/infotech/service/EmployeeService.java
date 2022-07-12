package com.infotech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infotech.model.Employee;


public interface EmployeeService {
	public abstract Employee fetchEmployeeNamAndSalaryById(int employeeId);
}