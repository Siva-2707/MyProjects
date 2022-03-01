package com.siva.jdbc;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/* DDL -Data definition language 
		 * DML -Data Manipulation Language (executeUpdate is used) Return number of rows affected of type Integer
		 * DQL -Data Query Language (executeQuery method is used) Coz, it returns object of ResultSet
		 * 
		 * */
		// TODO Auto-generated method stub

		String DMLquery = "INSERT INTO Demo VALUES(4,'Shree','Supriya')"; // --> DML
		String DQLquery = "Select * FROM Demo"; //-->DQL
//		Execution.executeDML(DMLquery);
		preparedExecution.delete(4);
		Execution.executeDQL(DQLquery);
	}

}
