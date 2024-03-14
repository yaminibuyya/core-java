package com.objectClass;

public class FinalizeMethodDemo {
	private  int id;
	public FinalizeMethodDemo(int id) {
		this.id=id;	
		System.out.println(id);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method");
	}
	 public static void main(String[] args) {
		 for(int i=0;i<=100;i++) {
		 new FinalizeMethodDemo(i);
	 }
	
		 
		 
	 }	

}
