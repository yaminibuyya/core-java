package com.twoformsofThreadcreation;

public class ThreadDemo extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child class");
		}
	}
	//i have created another method to make in thread creation but only once was thread created and that
	//to only in run()method bcz thread accepts run()method which is predefined
	public void eat() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	
		public static void main(String[] args) {
	    ThreadDemo d=new ThreadDemo();
	    System.out.println(d.isAlive());  
	    d.start();
	    System.out.println(d.isAlive()); 
	    //with out creating seperate method for eat()method output is very clumsy to handle it
	    ThreadDemo d1=new ThreadDemo();
	    System.out.println(d.isAlive()); 
	    d.eat();
		
	}

}
