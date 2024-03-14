package com.twoformsofThreadcreation;

public class threaddemoUSIngIMplements implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);	
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("main class");
		}
		threaddemoUSIngIMplements d=new threaddemoUSIngIMplements();
		Thread t1=new Thread(d);
		t1.start();
		
	}
	
	

}
