package com.starPatterns;

public class Diamond {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1;a<=8;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}
			for(int c=11;c>(a*2);c--) {
			System.out.print("*");
		}
		System.out.println();
		
		
		}
	}

}
