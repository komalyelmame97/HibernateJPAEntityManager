package com.hibernate.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	private String name;
	@Id
	private int id;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
