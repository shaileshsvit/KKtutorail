import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import dao.DBUtil;
import model.Employee;

public class Test9 {

	public static void main(String[] args) throws SQLException {
		Employee employee = getEmployee() ;
		createEmployee(employee);
	}

	public static void createEmployee(Employee employee) {

		String SQL = "SELECT *FROM employee_table";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(SQL,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)) {

			ResultSet rs = ps.executeQuery();
			
			rs.moveToInsertRow();
			
			rs.updateString("employee_name", employee.getEmployeeName());
			rs.updateString("email", employee.getEmail());
			rs.updateDouble("salary", employee.getSalary());
			rs.updateDate("date_of_joining", new java.sql.Date(employee.getDoj().getTime()));
			rs.updateBigDecimal("bonus", employee.getBonus());
			
			rs.insertRow();
			System.out.println("Employee is created..");
			
			while (rs.next()) {
				int empId = rs.getInt("employee_id");
				String eName = rs.getString("employee_name");
				String email = rs.getString("email");
				Double salary = rs.getDouble("salary");
				BigDecimal bonus = rs.getBigDecimal("bonus");
				Date date = rs.getDate("date_of_joining");
				
				employee = new Employee();
				employee.setEmployeeName(eName);
				employee.setBonus(bonus);
				employee.setDoj(date);
				employee.setEmail(email);
				employee.setEmployee_id(empId);
				employee.setSalary(salary);
				System.out.println(employee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setBonus(new BigDecimal(290));
		employee.setDoj(new Date());
		employee.setEmployeeName("John");
		employee.setEmail("john.cs2016@yahoo.com");
		employee.setSalary(90000.00);
		return employee;
	}
}