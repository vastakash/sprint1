package com.cpg.sprint1.connection;

import java.sql.*;

public class MyDBConnection {
	private static Connection con=null;
	public static Connection getConnection()  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			     System.out.println("driver loaded");


			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			           System.out.println("connection established");
		}
		 catch (SQLException e) {
				e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		 }
		return con;
	}
}
