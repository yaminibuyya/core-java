package com.createiq;

public class CharacterIsVowelOrConsonent {
	public static void main(String[] args) {
		char ch = 'l';
		
		if ((ch =='a'|| ch =='e'|| ch == 'i'|| ch =='o'|| ch == 'u' )||(ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch =='U'))  {
			System.out.println("It is VOWEL");
		}
		else if((ch>='a' && ch<='z')||(ch>='A' && ch>='Z')) {
			System.out.println("It is consonant");
		}
	}

}
