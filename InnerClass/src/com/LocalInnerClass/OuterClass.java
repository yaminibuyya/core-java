package com.LocalInnerClass;

public class OuterClass {
	
	//outer class method
	public void display() {
		System.out.println("my local");
	}
	
	//outer class constructor
	public OuterClass(String name,int age) {
		System.out.println(name+" "+age);
	
		 class InnerClass{
			 
			//inner class method
			public void msg() {
				System.out.println("Iam in Local Inner");
				System.out.println("okay done");
				
			}
			
			//inner class constructor
			public InnerClass(String Job,int Salary) {//inner class constructor
				System.out.println(Job+" "+Salary);
			}
		}
		InnerClass ic=new InnerClass("fullstack Developer",2500000);
		ic.msg();
			
		}
	public static void main(String[] args) {
		OuterClass oc=new OuterClass("yamini", 25);
		oc.display();
		
	
	}

		
	

}
