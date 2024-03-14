package com.createiq;

public class CharacterDigitSpecialcharacter {
	public static void main(String args[]) {
		
		char ch = 'D';
		if ((ch >= 'a' && ch <= 'z')||(ch >='A' && ch <= 'Z')){
			System.out.println("It is an alphabet");
			
		}
		else if(ch >='0' && ch <='9') {
			System.out.println("It is number");
		}
		else {
			System.out.println("It is a special character");
		}
	}

}
