package com.createiq.operators;

public class MaximumNumberBetween3Numbers {

	public static void main(String[] args) {
		int a =3000,b=400,c=809;
		int  maxnumber= (a>b && a>c)? a:
			(b > c && b>a) ? b : c;
		System.out.println("max number"+maxnumber);
		

	}

}
