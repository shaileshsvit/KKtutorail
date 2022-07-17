import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import dao.DBUtil;
import model.Employee;

public class Test10 {

	public static void main(String[] args) throws SQLException {
		resultSetNavigationMethods();
	}

	public static void resultSetNavigationMethods() {

		String SQL = "SELECT *FROM employee_table";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(SQL,ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE)) {
			ResultSet rs = ps.executeQuery();
			
			rs.absolute(2);
			int rowNum = rs.getRow();
			System.out.println("Row num:"+rowNum);
			
			rs.afterLast();
			boolean afterLast = rs.isAfterLast();
			System.out.println("AfterLast:"+afterLast);
			
			rs.beforeFirst();
			boolean beforeFirst = rs.isBeforeFirst();
			System.out.println("BeforeFirst:"+beforeFirst);
			
			rs.first();
			boolean isFirst = rs.isFirst();
			System.out.println("IsFirst:"+isFirst);
			
			rs.last();
			
			rs.relative(-2);
			
			int rowNum2 = rs.getRow();
			System.out.println("Row num2:"+rowNum2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}