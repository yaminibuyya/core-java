package com.imp.programs;

public class palindromelength {

	public static void main(String[] args) {
		String reverses1="";//for string we must give values because it is final 
		String s1="madam";
		int s1length=s1.length();//for iterating loop we must have to convert to length
		for(int i=(s1.length()-1);i>=0;--i) {
			reverses1=reverses1+s1.charAt(i);//charAt start with indexs each index character is represented here	
		}
		if(s1.toLowerCase().equals(reverses1.toLowerCase())) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		

	}

}
