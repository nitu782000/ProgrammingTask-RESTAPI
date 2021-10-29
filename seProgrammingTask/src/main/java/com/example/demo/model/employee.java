/*
 The UK DRI Care Research and Technology Centre Programming Task
 
 JPA Entity 
 
 Employee Model
 
 Developed by: Neeta Patel
 Date: 28/10/2021
 */

package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")

public class employee {
	
	private long id;
	private String emp_name;
	private String emp_status;
	private boolean completed;
	
	
	 
	 
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public employee(String emp_name, String emp_status) {
		super();
		this.emp_name = emp_name;
		this.emp_status = emp_status;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "emp_name", nullable = false)
	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	@Column(name = "emp_status", nullable = false)
	
	public String getEmp_status() {
		return emp_status;
	}

	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}

	@Column(name = "completed", nullable = false)

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	


}
