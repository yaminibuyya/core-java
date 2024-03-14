package com.createiq;

public class RootsOfQuadraticEquation {
	public static void main(String[] args) {
		int a=1,b=-3,c=10,discriminent;
		double root1,root2,imaginary;
		discriminent = (b*b)-(4*a*c);
		
		if (discriminent > 0) {
			root1 = (-b + Math.sqrt(discriminent))/(2*a);
			root2 = (-b - Math.sqrt(discriminent))/(2*a);
			System.out.println("Roots of Quadratic Equation: "+root1+root2);
			
		}
		if (discriminent == 0) {
			root1 = root2 = -b/(2*a);
			System.out.println("Roots of Quadratic Equation: "+root1+root2);
			
		}
		if(discriminent < 0) {
			root1=root2= -b/(2*a);
			imaginary = Math.sqrt(-discriminent)/(2*a);
			System.out.println("Roots of the Quadratic equation: "+root1+root2);
		}
		
		
	}

}
