package com.polymorphism;

public class methodOverloading {
	public int a;
	public int b;
	public int c;
	
	public void add(float a,double b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		methodOverloading p=new methodOverloading();
		p.add(2, 3);
		p.add(1, 2, 3);
 	}
	

}
