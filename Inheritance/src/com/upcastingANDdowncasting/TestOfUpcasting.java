package com.upcastingANDdowncasting;

public class TestOfUpcasting {

	public static void main(String[] args) {

		Parent p = new Child();
		//System.out.println(p.a=10);
		p.m1();
		
		//we can access only parent variables not child variables 
		//we can access specific methods we are overridden
		//example
		
		//System.out.println(p.b=20);
//here it throws error
}
}