package com.createiq;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the base");
		double base = scanner.nextDouble();
		System.out.println("enter the height");
		double height = scanner.nextDouble();
		double area= (base*height)/2;
		System.out.println("Area of triangle :"+(area));
		
		
		 
		
	}

}
