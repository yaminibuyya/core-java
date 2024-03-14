package com.createiq;

public class Varargs {
	public void add(int...n) {
		for(int i:n) {     //if we want to intialize varargs argumens....for more elements it acts like an array so it won't
			System.out.println(i);            //-->print directly only it prints array reference so we need to use for or for each loop
	}
	}
	public void add(int n) {
		System.out.println(n);
	}
	public void chars(char...ch) {
	
		System.out.println(ch); 
		
	}
	

	public static void main(String[] args) {
		 Varargs arguments=new  Varargs();
		 arguments.add(10,20,30,40,50);
		 arguments.chars('m','y','j');
		 
		

	}

}
