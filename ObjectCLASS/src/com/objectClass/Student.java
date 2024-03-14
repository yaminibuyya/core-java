package com.objectClass;

public class Student {
	private int id;
	private String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.getClass());
		System.out.println(s.toString());
		
	} //IF WE WONT OVERRIDE GETTERS AND SETTERS AND TOSTRING WE GET HEXASTRING IF WE DID WE GET NULL AND VALUES IF WE WONT INITIALIZE IT
	
	
}
