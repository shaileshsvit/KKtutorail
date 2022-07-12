package com.infotech.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.infotech.dao.EmployeeDao;
import com.infotech.model.Employee;

@Repository
public class EmployeeDaoImpl  implements EmployeeDao {

private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	
	@Override
	public void createEmployee(Employee employee) {
		//String sql = "insert into employee_table(employee_name,salary,email,gender) values (?,?,?,?)" ;
		//int update=jdbcTemplate.update(sql,new Object[] {employee.getEmployeeName(),employee.getSalary(),employee.getEmail(),employee.getGender()});
		
		/*
		 * int
		 * update=jdbcTemplate.update(sql,employee.getEmployeeName(),employee.getSalary(
		 * ),employee.getEmail(),employee.getGender());
		 * 
		 * if(update>0) System.out.println("table careted ");
		 */
	}
		/*
		 * @Override public void createEmployee(Employee employee) { // TODO
		 * Auto-generated method stub Connection connection = null; PreparedStatement ps
		 * = null;
		 * 
		 * try { connection = dataSource.getConnection();
		 * 
		 * String sql =
		 * "insert into employee_table(employee_name,salary,email,gender) values (?,?,?,?)"
		 * ; ps = connection.prepareStatement(sql); ps.setString(1,
		 * employee.getEmployeeName()); ps.setDouble(2, employee.getSalary());
		 * ps.setString(3, employee.getEmail()); ps.setString(4, employee.getGender());
		 * int executeUpdate=ps.executeUpdate(); if(executeUpdate>0)
		 * System.out.println("Emplyee is created... "); } catch (Exception e) {
		 * e.printStackTrace(); }finally { if(connection!=null) { try {
		 * connection.close(); } catch (SQLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } }
		 * 
		 * } }
		 */

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		
		  String sql="select * from employee_table where employee_id=:empId";
		  Map<String,Object> inputMap=new HashMap<>();
		  inputMap.put("empId",employeeId);
		 Employee employee= namedParameterJdbcTemplate.queryForObject(sql, inputMap, new EmplyeeRowMapper());
		 return employee;
		}

	@Override
	public void deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		/*
		 * String sql="delete  from employee_table where employee_Id=?"; int
		 * update=jdbcTemplate.update(sql,employeeId); if(update>0)
		 * System.out.println("emp have deleted");
		 */	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		/*
		 * String sql= "update employee_table set email=? where employee_Id=?"; int
		 * update=jdbcTemplate.update(sql,newEmail,employeeId); if(update>0)
		 * System.out.println("update done");
		 */	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		return null;
		// TODO Auto-generated method stub
		/*
		 * String sql="select * from employee_table "; List<Employee>
		 * list=jdbcTemplate.query(sql, new EmplyeeRowMapper());
		 * 
		 * return list;
		 */}

}
