package com.siva.demoApp.dao;

import java.sql.*;
import com.siva.demoApp.model.User;
public class UserDao {
	
	
	private Connection con;
	
	public Connection getConnection() {
		
		String username ="root";
		String password ="root";
		String url = "jdbc:mysql://localhost:3306/demo_db";
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	public boolean checkLogin(String username, String password) {
		
		String loginCheckQuery = "select * from USER_DATA where username = ? AND password = ? ";
		Connection con = getConnection();
		
		try {
			PreparedStatement pstmt = con.prepareStatement(loginCheckQuery);
			pstmt.setString(1,username);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				con.close();
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public User getUser(String username) {
		String query = "SELECT ID, USERNAME,PASSWORD FROM USER_DATA WHERE USERNAME = ?";
		User user = new User();
		
		try {
			Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return user;
	}
	
	public User getUser(int id) {
		String query = "SELECT ID, USERNAME,PASSWORD FROM USER_DATA WHERE ID = ?";
		User user = new User();
		
		try {
			Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return user;
	}
	
	public boolean setUser(String username, String password) {
		String checkQuery = "SELECT USERNAME FROM USER_DATA WHERE USERNAME = ?";
		String insertQuery= "INSERT into USER_DATA (USERNAME, PASSWORD) VALUES(?,?)";
		try {
			Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(checkQuery);
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) { // User already present.
				return false;
			}
			pstmt = con.prepareStatement(insertQuery);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			int result = pstmt.executeUpdate();
			if(result == 1)
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return false;
	}
	
	
}
