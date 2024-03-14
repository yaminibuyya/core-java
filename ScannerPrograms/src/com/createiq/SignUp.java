package com.createiq;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
	System.out.println("welcome to JavaGram! Let's sign you up.");
	System.out.println("what is your first name");
	String firstname = scanner.next();
	System.out.println("first name : "+firstname);
	System.out.println("what is your last name");
	String lastname = scanner.next();
	System.out.println("last name : "+lastname);
	System.out.println("how old are you");
	int age = scanner.nextInt();
	System.out.println("Age: "+age);
	System.out.println("write the username");
	String username = scanner.next();
	System.out.println("username: "+username);
	System.out.println("what city you live in");
	String city = scanner.next();
	System.out.println("city: "+city);
	System.out.println("which country you are from");
	String country = scanner.next();
	System.out.println("country: "+country);
	
	}

}
