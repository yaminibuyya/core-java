package com.twoformsofThreadcreation;


	public class MultipleThread implements Runnable
	{
	 String task;
	 MultipleThread(String task)
	 {
	  this.task = task;
	 }
	 
	 public void run()
	 {
		 synchronized (this) {
	  for(int i = 1; i <= 5; i++)
	  { 
	    System.out.println(task+ ":" +i);
	  }
	  try {
	     Thread.sleep(1000);
	  } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	 }
	public static void main(String[] args) 
	{
	 Thread nThread = Thread.currentThread();
	  System.out.println("Name of thread: " +nThread);	
	  
	// Multiple child threads acting on single object.	
	   MultipleThread mt = new MultipleThread("Hello Java");
	   Thread t1 = new Thread(mt);
	   Thread t2 = new Thread(mt);
	   Thread t3 = new Thread(mt);
	   
	    t1.start();
	    t2.start();
	    t3.start();

	 int count = Thread.activeCount();
	 System.out.println("No of active threads: " +count);
		}

}
