package com.polymorphism;

public class method1 {
	public void add() {
		int a=1;
		int b=2;
		int c=a+b;//void methods can not return a value
		System.out.println(c);
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	
	}
	
	public int add1() {
		int a=30;
		int b=40;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public int add1(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}

	
	public static void main(String[] args) {
		method1 m1=new method1();
		//System.out.println(m1.add()); PrintStream is not applicable for the argument void
		m1.add();
		m1.add(11,6);
		//System.out.println(m1.add1());or
		m1.add1();
		m1.add1(300,70);
		
		
	}
	
	
}
