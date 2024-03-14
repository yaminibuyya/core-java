package com.createiq.operators;

public class CharacterIsAlphabet {

	public static void main(String[] args) {
		char ch ='L';
		String result=(ch >= 'a' && ch<='z') || (ch >='A' && ch <='Z')? "It is an Alphabet ": "It is not an Alphabet" ;
		System.out.println(result);

	}
}
