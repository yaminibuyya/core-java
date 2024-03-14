package com.createiq;

public class AutoboxingANDunBoxing {

	public static void main(String[] args) {

		
		int b=440;
		Integer.valueOf(b);
		Integer i=b;
		System.out.println(i);
		
		
		Integer a=new Integer(20);
		int x=a.intValue();
		System.out.println(x);

	}

}
