package com.twoformsofThreadcreation;

public class ThreadPriority extends Thread {
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);	
		}
	}
	public static void main(String[] args) {
		ThreadPriority tp=new ThreadPriority();
		tp.start();
		tp.setPriority(MIN_PRIORITY);
		
		ThreadPriority tp1=new ThreadPriority();
		tp1.start();
		tp1.setPriority(MAX_PRIORITY);
		
		ThreadPriority tp2=new ThreadPriority();
		tp2.start();
		tp2.setPriority(NORM_PRIORITY);
		
	}

}
