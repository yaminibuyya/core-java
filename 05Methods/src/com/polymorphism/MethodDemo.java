package com.polymorphism;

public class MethodDemo {
	//with out return and with out parameters
	public void greetingMsg() {     //greetingMsg() is method name and it should be in small letters
		String name = "sahasra";
		System.out.println("welcome to java programming " +name +" ");
	}
	
	//with out return and with parameters
	public void WelcomeMsg(String name) {
		System.out.println(""+name + " welcome to java programming");
	}
	
    //with return and with out parameters 
	public String msg() {
		String message = "Hello sahasra what's up ";
		return message;
	}
	public String fullname() {
	String firstname="yamini";
	String lastname = "buyya";
	String  fullname =firstname+lastname;
	return fullname;
	}
	//with return and with parameters
	public String getfullname(String firstname,String lastname) {
		String fullname = firstname +" "+lastname;
		return fullname;
		
	}
	
	public static void main(String[] args) {
		MethodDemo demo=new MethodDemo();
		demo.greetingMsg();
		demo.WelcomeMsg("sahasra");
		System.out.println(demo.msg());
		System.out.println(demo.fullname());
		System.out.println(demo.getfullname("sahasra", "yamini"));
		System.out.println(demo.getfullname("krishnakumari ,", "adinarayana"));
	 

	}

}
