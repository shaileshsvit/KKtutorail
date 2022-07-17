import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DBUtil;

public class Test12 {

public static void main(String[] args) throws SQLException   {

		
		String SQL="SELECT *FROM storetextfile_table";
		try(Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(SQL);ResultSet 
				rs = ps.executeQuery()) {
			System.out.println("Following flies are downloaded from database..");
			while (rs.next()) {
				int fileId = rs.getInt("file_id");
				String fileName = rs.getString("file_name");
				long fileSizeInKb = rs.getLong("file_size_in_kb");
				String fileExtension = rs.getString("file_extension");
				System.out.println("File Id:"+fileId);
				System.out.println("File Name:"+fileName);
				System.out.println("File Size In KB:"+fileSizeInKb);
				System.out.println("File Extension:"+fileExtension);
				Clob clob = rs.getClob("file_content");
				InputStream inputStream = clob.getAsciiStream();
				
				System.out.println("-----------------------------------");
				Files.copy(inputStream, Paths.get("DownLoadFiles/"+fileName));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
