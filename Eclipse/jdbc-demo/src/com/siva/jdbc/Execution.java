package com.siva.jdbc;
import java.sql.*;
public class Execution {
	
	

		public static void executeDQL(String query) {
			try(
					Connection con = Connector.getConnector();
					Statement stmt = con.createStatement();			
					
					){ //AutoClosable resources can only be used inside Try with resources block.
				//Displaying
//				stmt.setMaxRows(2); // Limiting no. rows fetched.
				ResultSet rs = stmt.executeQuery(query); // For DQL
				while(rs.next()) {
				String output = rs.getString(1)+"  First Name: "+ rs.getString(2) + "   Last Name: "+ rs.getString(3);
				System.out.println(output);
				}
				
				
			}
			catch(Exception e){
				System.out.println(e);
			}
			
		}
		
		public static void executeDML(String query) throws SQLException {
			
			Connection con = null;
			Statement stmt = null;
			try {	
				//Inserting 
				con = Connector.getConnector();
				stmt = con.createStatement();
				int rowsAffected = stmt.executeUpdate(query); // Not AutoClosable
				System.out.println(rowsAffected +" row/s affected");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				//Closing resources
				if(con != null)
				con.close();
				if(stmt != null)
				stmt.close();
			}
		}
		
}
