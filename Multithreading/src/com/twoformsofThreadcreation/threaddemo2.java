package com.twoformsofThreadcreation;

public class threaddemo2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		threaddemo2 t1=new threaddemo2();
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("main class");
		}
		threaddemo2 t2=new threaddemo2();
		t2.start();
		threaddemo2 t3=new threaddemo2();
		t3.start();
	}

}
