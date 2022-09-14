package com.maven.hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class JPACrudOpearation 
{

	   public void insertRecord() {
		   EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		    EntityTransaction et = em.getTransaction();
		    et.begin();
		    
		    Student st = new Student();
		    st.setId(6);
		    st.setName("Arti");
		    em.persist(st);
		    em.getTransaction().commit();
		    
		    em.close();
		    System.out.println("Record Inserted sucessfully");
	   }
	   public void findEntity() {
	        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();
	        Student student = entityManager.find(Student.class, 1);
	        System.out.println("student id :: " + student.getId());
	        System.out.println("student name :: " + student.getName());
	       
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }
  public void deleteRecord() {
 	 EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();
	        Student student = entityManager.find(Student.class, 6);
	        System.out.println("student id :: " + student.getId());
	        System.out.println("student name :: " + student.getName());
	       entityManager.remove(student);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	        System.out.println("Record Dleted");
}
public void updateRecord() {
	  EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
   entityManager.getTransaction().begin();
   
   Student student = entityManager.find(Student.class, 2);
   System.out.println("student id :: " + student.getId());
   System.out.println("student name :: " + student.getName());
   student.setId(2);
   student.setName("chandra ");
   
  
  
   
 
   entityManager.getTransaction().commit();
   entityManager.close();
   System.out.println("Record UPdated");
}
}
