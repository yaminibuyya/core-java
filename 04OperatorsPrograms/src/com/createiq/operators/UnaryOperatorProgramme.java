package com.createiq.operators;

public class UnaryOperatorProgramme {
	public static void main(String[]  args) {
		
		int num1 = 9;
		int num2 = 7;
		 
		System.out.println("Pre increment: "+(++num1));
		System.out.println("Pre decrement: "+(--num2));
		System.out.println("Post increment: "+(num1++));
		System.out.println("Post decrement: "+(num2--));
		System.out.println((num1++ + ++num2));
	}

}
