 package com.create.iq;

public class PrimeNumbers {
	public static void main(String[] args) {
		int i,j;
		for(i=2;i<10;i++) {
			int count=0;
 			for(j=2;j<i;j++) 
				
			{
				if(i%j==0) 
					count++;	
				
			}
				if(count==0) 
					System.out.println(i);
				
		}
	}
}
	
