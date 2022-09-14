package com.hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	private static final EntityManagerFactory emFactoryObj;
	private static final String PERSISTENCE_UNIT_NAME = "JPADemo";

	static {
		emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	// This Method Is Used To Retrieve The 'EntityManager' Object
	public static EntityManager getEntityManager() {
		return emFactoryObj.createEntityManager();
	}

	public static void main(String[] args) {
		EntityManager entityMgr = getEntityManager();
		entityMgr.getTransaction().begin();
		Student st = new Student("Ravina", 14);

		entityMgr.persist(st); // used to insert data into database

		entityMgr.getTransaction().commit();

		entityMgr.clear();
		System.out.println("Record Successfully Inserted In The Database");

	}

}
