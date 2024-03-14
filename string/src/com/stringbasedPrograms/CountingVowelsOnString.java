package com.stringbasedPrograms;

public class CountingVowelsOnString {

	public static void main(String[] args) {
		int count=0;
		String s1="we are good to know that u r safe iu";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count++);

	}

}
