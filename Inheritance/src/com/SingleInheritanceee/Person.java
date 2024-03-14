package com.SingleInheritanceee;

public class Person extends Employee {
	 public String nam;
	public void Details(String name,int age) {
		System.out.println("name is: " +name);
		System.out.println("age is: " +age);
		
		
	}
	public Person(String nam) {
		this.nam=nam;
		System.out.println("person name :" +nam);
		
		
	}

	public Person(int Experience) {
		super(Experience);
		
	}
	
	public static void main(String[] args) {
		Person p=new Person(9);
		Person p1=new Person("yamini");
		//System.out.println("person name : "+p1);
		
        p.Details("yamini", 25);
        Employee e=new Employee ();//here if we won't create a default constructor we have to give values so if we dont want to give values we need default constructor
        System.out.println("Employee id: "+ e.Refid);
        
	
			
		}
	}


