package com.createiq;

public class EquilateralScaleneIsoscelesTriangle {

	public static void main(String[] args) {
		int a=30,b=70,c=30;
		
		if(a==b && b==c ) {
			System.out.println("It is an equilateral triangle");
		}
		if(a==b || b==c || a==c) {
			System.out.println("It is an isosceles triangle");
		}
		if(a!=b && b!=c && c!=a) {
			System.out.println("It is a scalene triangle");
		}
			
		
		
		

	}

}
