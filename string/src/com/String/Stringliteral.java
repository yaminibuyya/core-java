package com.String;

public class Stringliteral {

	public static void main(String[] args) {
		String s1="sahasra yamini";
		String s2="sahasra yamini";
		String s3=new String("work hard");
		//String s4=new String("work hard");
		String s4=s3;
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.equals(s2));//equals method
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());//checking hashCode which is nothing but checking inter values of reference values
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);//for string literals reference//compare method 
		System.out.println(s3==s4);//new keyword compare reference
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		String s5="Ea";
		String s6="FB";
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());//content different but we get same hashcode so we should not depend only hashcode we have to check equals method too 
	    System.out.println(s5.equals(s6));
		
	}

}
