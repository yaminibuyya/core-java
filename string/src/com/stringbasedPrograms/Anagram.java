package com.stringbasedPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="Listen";
		String s2="Silent";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {    //first check length if all the characters are there are not
			System.out.println("It is not a anagram");
			}
		else {
			char[] ch1=s1.toCharArray();   //first string to array then only we can sort right
			char[] ch2=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("both Strings are anagram");
			}
			else {
				System.out.println("It is not correct format of anangram");
			}
			}
		
		
		
		
		
		
		
		
	}

}
