package com.hibernate.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class User {
	
	
	    @Id
	    @GeneratedValue
	    private int id;
	    @NotNull
	    private String name;
	    @NotNull
	    @Pattern(regexp = "(\\d){3,3}-\\d{3,3}-\\d{4,4}",
	            message = "The phone number must match 111-111-1111 format")
	    private String phone;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", getId()=" + getId() + ", getName()="
					+ getName() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}

	
	    
	    
	    
	
}
