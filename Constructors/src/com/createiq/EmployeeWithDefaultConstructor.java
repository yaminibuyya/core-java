package com.createiq;

public class EmployeeWithDefaultConstructor {

	int id;
	String name;
	String email;
	int salary;

	public EmployeeWithDefaultConstructor() {
		System.out.println("Default Constructor");
	}

	public EmployeeWithDefaultConstructor(int id, String name, String email, int salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public void displayEmployeeData() {
		System.out.println("employee id: " + id);
		System.out.println("employee name: " + name);
		System.out.println("employee email: " + email);
		System.out.println("employee salary: " + salary);

	}

	public static void main(String[] args) {
		EmployeeWithDefaultConstructor emp = new EmployeeWithDefaultConstructor(01, "sahasra", "sahasra@gmail.com", 90000);
		//System.out.println(emp);

		emp.displayEmployeeData();
	}
}
