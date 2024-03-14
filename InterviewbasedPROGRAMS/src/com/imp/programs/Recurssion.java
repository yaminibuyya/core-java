 package com.imp.programs;

public class Recurssion {
	//creating a method
	 public static  int factorial(int number) {
		 if(number!=0) {
			return number*factorial(number-1);
		 }
		 else {
			 return 1;
		 }
		
	}
	 public static void main(String[] args) {
		 System.out.println(factorial(0));
	 }
	

}
