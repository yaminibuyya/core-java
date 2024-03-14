package com.createiq;

public abstract class SidesOfTriangle {

	public static void main(String[] args) {
		int a = 6,b=7,c=9;
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("Triangle is valid ");
		}
		else {
			System.out.println("Triangle is not valid");
		}
		
		
		
}

}
