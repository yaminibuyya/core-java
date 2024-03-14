 package com.Aggregation;

public class EmployeeTest {

	public static void main(String[] args) {
		Address demo=new Address("Khammam", "telangana");
		Department dept1=new Department(3543, "techinical engineer");
		
		Employee e1=new Employee(56890, "Sahasra", 900000, demo, dept1) ;
		System.out.println("Employee id: "+e1.getId());
		System.out.println("Employee Name: "+e1.getName());
		System.out.println("Employee salary: "+e1.getSalary());
		System.out.println("Employee city: "+e1.getAddress().getCity());
		System.out.println("Employee state: "+e1.getAddress().getState());
		System.out.println("Employee Department Id: "+e1.getDept().getId());
		System.out.println("Employee Department name: "+e1.getDept().getName());
		
		
		
		
			
		}
	}


