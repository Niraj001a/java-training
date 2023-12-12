package storeProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class SalaryPrint {

public static void main(String[] args) {
		
		Connection conn= null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learningsql","root","root1234");
			
			CallableStatement cs= conn.prepareCall("{call Printsal(?,?,?,?)}");
			cs.setInt(1, 3);
			cs.registerOutParameter(2,Types.INTEGER);
			cs.setInt(3, 10);
			cs.registerOutParameter(4,Types.INTEGER);
			cs.execute();
			System.out.println("Old salary  :"+cs.getInt(2));
			System.out.println("new salary  :"+cs.getInt(4));
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		}
}
