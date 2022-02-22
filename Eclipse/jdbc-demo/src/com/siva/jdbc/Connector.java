package com.siva.jdbc;
import java.sql.*;
public class Connector {
	
	public static Connection getConnector() throws SQLException{
		String username = "root";
		String password = "password";
		String url = "jdbc:mysql://localhost/jdbcdb";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
		
	}

}
