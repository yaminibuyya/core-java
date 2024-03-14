package com.createiq;

public class CharacterIsAlphabet {
	public static void main(String args[]) {
		char ch = 'L';
		
		if((ch>='a' && ch<='z') || (ch >='A' && ch <= 'Z')) {
			System.out.println(" It is alphabet");
		}
		else {
		
			System.out.println("It is not an alphabet");
		}
				
		
	}

}
