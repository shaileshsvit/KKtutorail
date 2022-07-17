import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import dao.DBUtil;

public class Test3 {
public static void main(String[] args) {
	String SQL = "CALL getEmployeeById(?)";
	try(Connection connection = DBUtil.getConnection();
			CallableStatement cs =  connection.prepareCall(SQL);
			Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter Employee ID::");
		int empId = scanner.nextInt();
		
		cs.setInt(1, empId);
		
		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			int empId2 = rs.getInt("employee_id");
			String eName = rs.getString("employee_name");
			String email = rs.getString("email");
			Double salary = rs.getDouble("salary");
			BigDecimal bonus = rs.getBigDecimal("bonus");

			System.out.println(empId2 + "\t" + eName + "\t" + salary + "\t" + email + "\t" + bonus);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
