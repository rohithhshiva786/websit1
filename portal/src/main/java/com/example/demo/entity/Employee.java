package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="EmployeeDetails")
@Entity
public class Employee{
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="SALARY")
	private int Salary;
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
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary ) {
		this.Salary=salary;
	}
	public Employee(int id, String name,int Salary) {
		super();
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}
	public Employee()
	{
		}
	}

	



