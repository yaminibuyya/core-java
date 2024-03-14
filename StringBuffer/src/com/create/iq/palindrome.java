package com.create.iq;

public class palindrome {

	public static void main(String[] args) {
		String s1="malayalam";
		StringBuffer s2=new StringBuffer("malayalam");
		String s3=s2.reverse();
		//String s3=s2.toString();
		if(s1.equals(s3)) {
			System.out.println("palindrome"+s2);
		}
		else {
			System.out.println("It is not palindrome");
		}
		
			}

}
