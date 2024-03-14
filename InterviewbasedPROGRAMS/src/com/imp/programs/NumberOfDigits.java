 package com.imp.programs;

	public class NumberOfDigits {
		public static void main(String[] args) {
		
			int n=123456789;
			int remainder;
			int count=0;
			while(n>0) {
				remainder=n%10;
				n=n/10;
				if(remainder!=0) {
					count++;
				}
				
			}
			
			System.out.println(count);
			

		}
	}
