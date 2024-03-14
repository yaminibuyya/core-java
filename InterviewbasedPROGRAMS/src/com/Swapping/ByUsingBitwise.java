package com.Swapping;

public class ByUsingBitwise {

	public static void main(String[] args) {
int a=5;
int b=9;
System.out.println("Before swapping: "+a +" "+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("After swapping: "+a +" "+b);
		
		
		
		
		
	}

}
