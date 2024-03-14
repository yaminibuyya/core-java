package com.Exceptionsbased;

public class NullpointerException {

	public static void main(String[] args) {	
		String msg=null;
		//System.out.println(msg.length());
		System.out.println(msg.toString());
		
	//Array out of bound exception	
		int[] numbers= {1,2,4,5};
		for(int i=0;i<=numbers.length;i++) {
		System.out.println(numbers[i]);
//		

	}

	}
}
