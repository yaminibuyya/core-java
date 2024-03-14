package com.imp.programs;

	public class ReverseNumber {
		public static void main(String[] args) {
			
			int n=12345;
			int reverse=0;
			int remainder;
			while(n>0) {
				remainder=n%10;
				reverse=reverse*10+remainder;
				n=n/10;
			}
		
			System.out.println("reverse order of the number is "+reverse);
			
			int number=98765;
			int reverse1=0;
			int remainder1=0;
			while(number>0) {
				remainder1=number%10;
				reverse1=reverse1*10+remainder1;
				number=number/10;
			}
			System.out.println(reverse1);
			
			
		}

	

}
