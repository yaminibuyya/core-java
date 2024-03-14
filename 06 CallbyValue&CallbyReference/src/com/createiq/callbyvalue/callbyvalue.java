package com.createiq.callbyvalue;

public class callbyvalue {
	 //static int number=10; OR
	
	public static void incr(int number) {
		number=number+1;
		System.out.println("value of the method: "+number);
	}
	public static void main(String[] args) {
		callbyvalue c=new callbyvalue();
	
		int number=10;
		
		System.out.println("value before method call:"+number);
		//	incr(number);
		incr(number);
		System.out.println("value after method call:"+number);
	}

}
