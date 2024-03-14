package com.String;

public class spilt {

	public static void main(String[] args) {
		String s1="my name is sahasra";
		String[] s2=s1.split("\\s",2);
		for(String remo:s2) {
			System.out.println(remo);
			
		}

	}

}
