package com.createiq;

 import java.util.Scanner;
 
public class ChatBot {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your name");
		String name = scanner.next();
		System.out.println("hi " +name+ " where are you from");
	
		String home = scanner.next();
		System.out.println("how old are you"+ "okay you are from " +home);
		int age = scanner.nextInt();
		System.out.println("Iam 400 years old and iam much older than you its about " +400/age + " times older than you");
		System.out.println("which language do you know");
		System.out.println("don't say you know python iam not much into it");
		String language = scanner.next();
		System.out.println( "okay you know " +language+ " that's great 'nice chatting with you' " +name+ " iam logging off bye" );
		
		
				
		
		
		

	}

}
