package com.twoformsofThreadcreation;

public class practiceSleep implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}
	public static void main(String[] args) {
		practiceSleep ps=new practiceSleep();
		Thread t1=new Thread(ps);
		t1.start();
	}

}
