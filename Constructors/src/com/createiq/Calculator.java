package com.createiq;
//method overloading and constructor overloading
public class Calculator {
	
	public int sum(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public long sum(long a,long b) {
		long sum=a+b;
		return sum;
	}
	public float sum(float a,float b) {
		float sum=a+b;
		return sum;
	}
	public double sum(double a,double b) {
		double sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		Calculator demo=new Calculator();
		System.out.println(demo.sum(22.9, 22.1));
		

	}

}
