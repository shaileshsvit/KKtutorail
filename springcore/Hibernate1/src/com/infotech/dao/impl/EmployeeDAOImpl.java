package com.infotech.dao.impl;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void createEmployee(Employee employee) {
		hibernateTemplate.save(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee employee = hibernateTemplate.get(Employee.class,employeeId);
		return employee;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		Employee employee=new Employee();
		employee.setEmployeeId(employeeId);
		
		hibernateTemplate.delete(employee);
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		Employee employee = hibernateTemplate.get(Employee.class,employeeId);
		employee.setEmail(newEmail);
		
		hibernateTemplate.update(employee);
	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		
		DetachedCriteria criteria= DetachedCriteria.forClass(Employee.class);
		List<Employee> EmpList =(List<Employee>) hibernateTemplate.findByCriteria(criteria);
		return EmpList;
	}
	
}