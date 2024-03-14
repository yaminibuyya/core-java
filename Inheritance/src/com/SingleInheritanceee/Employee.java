package com.SingleInheritanceee;

public class Employee {
	
	public int Refid=9876;
	public int Experience;
	
	
	public  Employee(int Experience) {
		//this.Experience=Experience;
		if(Experience>9) {
			System.out.println("Person Salary is : " + 2500000);
		} 
		if(Experience>5) {
			System.out.println("Person Salary is :" + 1800000);
		}
		else{
			System.out.println("Person Salary is :"+ 1000000);
		}
		
		
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}
}

		
		

	


