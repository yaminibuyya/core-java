package com.createiq.operators;

public class BitwiseOperator1 {
	public static void main(String[] args) {
		 
		short  s = 4;
		short  y = 7;
		 
		System.out.println("Bitwise AND operator: "+(s&y));
		System.out.println("Bitwise OR operator: "+(s|y));
		System.out.println("Bitwise Xor operator: "+(s^y));
	}

}
