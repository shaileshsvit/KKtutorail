
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.DBUtil;

public class ClientTest {

	public static void main(String[] args) {
		//createEmployee();
	//	updateEmployeeEmailById();
		//deleteEmployeeById();
		//getEmployeeById();
		getAllEmployeesInfo();
	}

	
	private static void getAllEmployeesInfo() {

		try (Connection connection = DBUtil.getConnection(); Statement st = connection.createStatement();) {

			String SQL = "SELECT *FROM employee_table";
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				int empId = rs.getInt("employee_id");
				String eName = rs.getString("employee_name");
				String email = rs.getString("email");
				Double salary = rs.getDouble("salary");
				BigDecimal bonus = rs.getBigDecimal("bonus");

				System.out.println(empId + "\t" + eName + "\t" + salary + "\t" + email + "\t" + bonus);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void getEmployeeById() {

		try (Connection connection = DBUtil.getConnection(); Statement st = connection.createStatement();) {

			String SQL = "SELECT *FROM employee_table WHERE employee_id=3";
			ResultSet rs = st.executeQuery(SQL);
			if (rs.next()) {
				int empId = rs.getInt("employee_id");
				String eName = rs.getString("employee_name");
				String email = rs.getString("email");
				Double salary = rs.getDouble("salary");
				BigDecimal bonus = rs.getBigDecimal("bonus");

				System.out.println(empId + "\t" + eName + "\t" + salary + "\t" + email + "\t" + bonus);

			} else {
				System.out.println("Employee doesn't exit with provided ID..");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void updateEmployeeEmailById() {
		try(Connection connection = DBUtil.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "UPDATE employee set email='martin.cs2017@yahoo.com' WHERE employee_id=4";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Email is updated..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createEmployee() {
		try(Connection connection = DBUtil.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "INSERT INTO employee(employee_name,email,salary,date_of_joining,bonus) "
					+ "VALUES('Paul2','paul.cs2009@yahoo.com',60000.00,'2017-05-17',400.00)";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Employee is created..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}