package com.methodOverloading;

public class Sample{
	int disp1(int x){
		return x;	
	}
	double disp2(double d){
		return d;
	}
	public static void main(String args[])
{
	Sample s = new Sample();
	System.out.println("Value of x : " + s.disp1(5));
	System.out.println("Value of y : " + s.disp2(6.5));
	}  
}
