package com.siva.hibernate.demo.controller;

import com.siva.hibernate.demo.beans.User;
import com.siva.hibernate.demo.hibernateOperations.PerformHibernateOperationOnUser;

public class UserController {
	
	PerformHibernateOperationOnUser operation = new PerformHibernateOperationOnUser();
	
	public void insertUser(User user) {
		operation.createUser(user);
	}
	
	
}
