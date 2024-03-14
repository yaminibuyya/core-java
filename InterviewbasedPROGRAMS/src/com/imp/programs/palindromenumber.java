package com.imp.programs;

public class palindromenumber {
	public static void main (String[] args) {
		int num=454,reverseNum=0,temp;
		int originalnumber=num;
		
		while(num>0) {
			temp=num%10;
			reverseNum=(reverseNum*10)+temp;
			num=num/10;	
		}
		if(originalnumber==reverseNum) {
			System.out.println("It is palindrome ");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}

}
