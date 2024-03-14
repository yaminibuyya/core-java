package com.createiq;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("radius of the circle");
		 double radius = scanner.nextDouble();
		 System.out.println("radius:"+radius);
		System.out.println("diameter of the circle"+(2*radius));
		System.out.println("Area of the circle"+(3.14*radius*radius));
		System.out.println("perimeter of the circle"+(2*3.14*radius));
	
		

	}

}
