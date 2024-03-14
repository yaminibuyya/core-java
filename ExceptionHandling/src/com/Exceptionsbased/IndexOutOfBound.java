package com.Exceptionsbased;

public class IndexOutOfBound {

	public static void main(String[] args) {
		//array out of bound index
//		int a[]= {1,2,3,4};
//		for(int i=0;i<=a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		//string out of bound index
		String s1="yamini";
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++) {//if i<=s1.length() means we get the string out of bound exception
			System.out.println(s1.charAt(i));
		}
		//here also we get error 
		System.out.println(s1.charAt(78));
		

	}

}
