package com.siva.jdbc;
import java.sql.*;
public class Execution {
	
	

		public static void executeDQL(String query) {
			try(
					Connection con = Connector.getConnector();
					Statement stmt = con.createStatement();			
					ResultSet rs = stmt.executeQuery(query); // For DQL
					
					){ //AutoClosable resources can only be used inside Try with resources block.
				//Displaying
				
				while(rs.next()) {
				String output = "First Name: "+ rs.getString(2) + "   Last Name: "+ rs.getString(3);
				System.out.println(output);
				}
				
				
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		
		public static void executeDML(String query) {
			
			try {
				Connection con = Connector.getConnector();
				Statement stmt = con.createStatement();	
				//Inserting 
				int rowsAffected = stmt.executeUpdate(query); // Not AutoClosable
				System.out.println(rowsAffected +" row/s affected");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
}
