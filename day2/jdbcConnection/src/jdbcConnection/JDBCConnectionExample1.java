package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionExample1 {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcexample";
		String username="root";
		String password="root1234";
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url,username,password);
			if(con!=null) {
				System.out.println("Connection successfull.....");
			}else {
				System.out.println("Not connected..........");
			}
		}
		catch(Exception e) {
			System.out.println("ERROR"+e.getMessage());
		}
		finally {
			if(con!=null) {
				con.close();
				System.out.println("Closing Connection.........");
			}else {
				System.out.println("Cant able to close the connection.....");
			}
				
			
		}
	}
}
