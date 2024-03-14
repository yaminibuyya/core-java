package com.imp.programs;

public class PrimeORnot {

	public static void main(String[] args) {
		int count =0;
		int  l=13;
		for(int i=1;i<=l;i++) {
			if (l%i==0) {
				count++;
			}
		}
		if(count==2 ) {
			System.out.println("it is a prime number");
		}else {
			System.out.println("it is not a prime number");
		}
		
//		int count1=0;
//		int number=123;
//		for(int i=1;i<=number;i++) {
//			if(number%i==0) {
//				count1++;
//			}
//		}
//		if(count==2) {
//			System.out.println("prime");
//		}else {
//			System.out.println("not");
//		}
//
//	}

	}
}
