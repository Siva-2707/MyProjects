package com.siva.hibernate.demo.hibernateOperations;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.siva.hibernate.demo.beans.User;

public class PerformHibernateOperationOnUser {
	
//	private User user;
	private Session session;
	private Transaction txn;
	public PerformHibernateOperationOnUser() {
		session = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory().openSession();
		txn = session.getTransaction();
	}


	public void updateUser(User user2) {
		
	}


	public void deleteUser(User user2) {
	}


//	public User readUser(User user2) {
//		return (User) session.get(User.class,user2.getId());
//	}


	public void createUser(User user2) {
		txn.begin();
		session.save(user2);
		txn.commit();
	}
	
}
