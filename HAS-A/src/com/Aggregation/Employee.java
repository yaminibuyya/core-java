package com.Aggregation;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address address;
	private Department dept;
	public Employee() {
		
	}
	
	public Employee(int id,String name,double salary,Address address) {
		this.id=id;
		this. name=name;
		this .salary=salary;
		this.address=address;	
	}
	public Employee(int id,String name,double salary,Address address,Department dept) {
		this.id=id;
		this. name=name;
		this .salary=salary;
		this.address=address;
		this.dept=dept;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

}
