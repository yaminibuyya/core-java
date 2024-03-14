package com.twoformsofThreadcreation;

	public class MyThread extends Thread {

		@Override
		public void run() {
			for(int i=0;i<=5;i++) {
				//System.out.println(Thread.currentThread().getName()+" "+i);
				System.out.println(ThreadColors.ANSI_CYAN + " " + "child class");
			}
			
		}
		public static void main (String[] args) {
			for(int i=0;i<=5;i++) {
				//System.out.println(Thread.currentThread().getName()+" "+i);
				System.out.println(ThreadColors.ANSI_RED + " " + "main class" );
			}
			for(int i=0;i<=5;i++) {
				//System.out.println(Thread.currentThread().getName()+" "+i);
				System.out.println(ThreadColors.ANSI_GREEN + " " + i );
			}
			
			MyThread m1=new MyThread();
			//System.out.println(ThreadColors.ANSI_CYAN +"po");
			m1.start();
			
			
			
			
		}
		
		
		

	}