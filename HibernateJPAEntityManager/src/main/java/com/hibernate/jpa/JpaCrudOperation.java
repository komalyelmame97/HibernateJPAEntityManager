package com.hibernate.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class JpaCrudOperation {
	public void insertRecord(Student st) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(st); // used to insert data into database
		entityManager.getTransaction().commit();
		entityManager.clear();
		System.out.println("Record Successfully inserted in to Database");

	}

	public void findRecordById(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Student student = entityManager.find(Student.class, id);
		System.out.println("student id :: " + student.getId());
		System.out.println("student name :: " + student.getName());
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Record Successfully fetch from database");

	}

	public void updateRecordById(int id, String name) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Student student = entityManager.find(Student.class, id);
		student.setName(name);

		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Record updated Successfully into database");

	}

	public void deleteRecordById(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Record deleted Successfully from database");

	}

	@SuppressWarnings("unchecked")
	public void fetchAllRecords() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		List<Student> studentsList = new ArrayList<Student>();
		studentsList = entityManager.createQuery("FROM Student").getResultList();
		if (studentsList == null) {
			System.out.println("No Record Found");
		} else {
			for (Student student : studentsList) {
				System.out.println("student id :: " + student.getId());
				System.out.println("student name :: " + student.getName());
			}
		}
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Records Successfully fetch from database");
	}
}
