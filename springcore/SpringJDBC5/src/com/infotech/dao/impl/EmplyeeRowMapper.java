package com.infotech.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infotech.model.Employee;

public class EmplyeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmail(rs.getString("email"));
		emp.setEmployeeId(rs.getInt("employee_id"));
		emp.setEmployeeName(rs.getString("employee_name"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

}
