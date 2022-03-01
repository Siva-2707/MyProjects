package com.siva.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class preparedExecution {

	public static void delete(int id) throws Exception{
		String sql = "DELETE FROM Demo WHERE SNO = ?";
		try (
				Connection con = Connector.getConnector();
				PreparedStatement pstmt = con.prepareStatement(sql);
				)
				{
			pstmt.setInt(1, id);
			int result = pstmt.executeUpdate();
			if(result != 0)
				System.out.println(result+ " row/s deleted");
			else
				System.out.println("Invalid ID");
		}
	}
}
