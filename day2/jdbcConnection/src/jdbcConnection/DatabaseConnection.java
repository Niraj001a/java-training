package jdbcConnection;

import java.sql.SQLException;

public class DatabaseConnection {
	public static void main(String[] args) throws SQLException {
		try {
			JDBCOperation jb = new JDBCOperation("root", "root1234");
//		jb.createDatabase("Test11");
//		jb.createTable("Emp1");
//			jb.insertData();
			jb.showdata();
			jb.closeConnection();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
