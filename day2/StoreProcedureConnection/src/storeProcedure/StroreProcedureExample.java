package storeProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StroreProcedureExample {
	
	public static void main(String[] args) {
		
		Connection conn= null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learningsql","root","root1234");

//			CallableStatement cs= conn.prepareCall("{call updateEmpSalary(?,?)}");
//			cs.setInt(1, 1);
//			cs.setInt(2, 10);
//			cs.executeUpdate();
//			System.out.println("Updated successfully");
			
			
			
			CallableStatement cs= conn.prepareCall("{Call incCounter(?)}");
			cs.registerOutParameter(1,Types.INTEGER);
			cs.setInt(1, 1);
			cs.execute();
			System.out.println("Counter  :"+cs.getInt(1));
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
