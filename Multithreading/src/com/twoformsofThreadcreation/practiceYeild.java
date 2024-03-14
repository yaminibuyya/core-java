package com.twoformsofThreadcreation;

public class practiceYeild extends Thread {
	   public void run() {
		      for (int i = 0; i < 5; ++i) {
		         Thread.yield(); // By calling this method, MyThread stop its execution and giving a chance to a main thread
		         System.out.println("Thread started:" + Thread.currentThread().getName());
		      }
		      System.out.println("Thread ended:" + Thread.currentThread().getName());
		   }


		   public static void main(String[] args) {
		      practiceYeild thread = new practiceYeild();
		      thread.start();
		      for (int i = 0; i < 5; ++i) {
		         System.out.println("Thread started:" + Thread.currentThread().getName());
		      }
		      System.out.println("Thread ended:" + Thread.currentThread().getName());
		   }
		}



