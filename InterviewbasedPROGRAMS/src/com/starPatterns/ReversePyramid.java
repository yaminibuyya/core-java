package com.starPatterns;

public class ReversePyramid {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=13;k>(i*2);k--) {
			System.out.print("*");
		}
		System.out.println();
		
		
		}
	}
}
	
	
	
