import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DBUtil;

public class Test8 {
//public static void main(String[] args) {
	public static void main(String[] args) throws SQLException {
		int empId = 2;
		String newEmail = "paul.cs20055@gmail.com";
		updateEmailById(empId, newEmail);
	}

	public static void updateEmailById(int empId, String newEmail) {

		String SQL = "SELECT *FROM employee_table";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(SQL,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)) {

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int employeeId = rs.getInt("employee_id");
				if(employeeId ==empId ){
					rs.updateString("email", newEmail);
					rs.updateRow();
					System.out.println("Email is updated..");
				}
			}

			//rs.absolute(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}