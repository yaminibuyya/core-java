package com.Exceptionsbased;

public class illegalerror {
	int age;
	public void setAge(int age) {
		if(age>26) {
			System.out.println("my");
			//throw new IllegalArgumentException("Age must not be greater than 26");
		
		}
		
		else {
			System.out.println(age);
			throw new IllegalArgumentException("Age must not be greater than 26");

			
		}
	
		}
	public static void main(String[] args) {
		illegalerror ie=new illegalerror();
		ie.setAge(8);
		ie.setAge(89);
	}

}
