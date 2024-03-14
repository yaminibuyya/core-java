package com.createiq;

public class MaximumOf3Numbers {

	public static void main(String[] args) {
		int a=500,b=6000,c=90;
		
		if(a>b && a>c) {
			System.out.println("maximum number: "+a);
		}
		else if(b>a && b>c) {
        	System.out.println("maximum number: "+b);
        }
		else {
			System.out.println("maximum number: "+c);
        }
	}

}
