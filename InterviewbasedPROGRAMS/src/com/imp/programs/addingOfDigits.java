package com.imp.programs;

public class addingOfDigits {
	public int yam() {
		int n=4765;
		int sum=0;
		
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		addingOfDigits ad=new addingOfDigits();
	   System.out.println(ad.yam());
	}
		
	

}
