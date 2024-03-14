package com.composition;

public class JobTest {
	

	public static void main(String[] args) {
		Job create =new Job("salesforce developer", 90000, 3456789);
		
		Person demo=new Person("yamini","buyya", 994887576, "yaminibuyya@gmail.com", create);
		System.out.println("Person name: "+demo.getName());
		System.out.println("Person Lastname: "+demo.getLastname());
		System.out.println("Person Phonenumber: "+demo.getPhonenumber());
		System.out.println("Person EmailId: "+demo.getEmailId());
		System.out.println("Person JOB Role: "+create.role);
		System.out.println("Person JOB Salary: "+create.salary);
		System.out.println("Person JOB ID: "+demo.getJob().getId());
		System.out.println(Job.a);
	
		
	}

}
