package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOperation {
	private Connection conn;
	private String username;
	private String password;
	private String query;
	
	public JDBCOperation() {
		System.out.println("Default constructor of JDBCOperations is called");
		conn=null;
		username="";
		password="";
		query="";
	}
	
	public static Connection mysqlConnection(String username,String password) throws SQLException {
		Connection conn=null;
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcexample",username,password);
		return conn;
		
	}
	
	public JDBCOperation(String username,String password) throws SQLException {
		System.out.println("Parameterised constructor of JDBCOperations is called");
		this.username=username;
		this.password=password;
		this.conn=JDBCOperation.mysqlConnection(username, password);
//		System.out.println(this.conn);
		query="";
	}
//	Creating Database..............
	public void createDatabase(String name) throws SQLException{
		Statement stmt = conn.createStatement();
//		Sending Sql command
		String query= "Create database "+name;
		stmt.executeUpdate(query);
		System.out.println("Databse Created......");
		
		
	}
	
//	Creating Table..............
	public void createTable(String tabname) throws SQLException{
		Statement stmt = conn.createStatement();
//		Sending Sql command
		String query= "Create table "+tabname+"(id int,name VARCHAR(20))";
		stmt.executeUpdate(query);
		System.out.println("Table Created......");
		
		
	}
	
//	Displaying the record from the database
	public void showdata() throws SQLException{
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from emp1");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+rs.getString(2));
		}
	}
	
	public void insertData() throws SQLException {
		Statement stmt = conn.createStatement();
		stmt.execute("insert into emp1 values(101,'Niraj')");
		stmt.execute("insert into emp1 values(102,'Ayesha')");
		stmt.execute("insert into emp1 values(103,'yash')");
		stmt.execute("insert into emp1 values(104,'Madhur')");
		
		System.out.println("Data Inserted");


		
		
	}
	
	public void closeConnection() throws SQLException {
		if(this.conn!=null) {
			this.conn.close();
			System.out.println("Closing Connection...........");
		}else {
			System.out.println(" Connection not found close...........");
			
		}
		
	}
	
	

}

