package com.create.iq;

public class SortingDecending {

	public static void main(String[] args) {
		int	num	[]= {2,7,4,9,6,1};
		   
		int temp=0;

		for(int i=0 ; i<num.length; i++) {

			for(int j=i+1; j<num.length; j++) {
			 	//here we have decending sorting	
				if(num[i]<num[j]) {
					
					temp=num	[i];
					num	[i]=num	[j];
					num	[j]=temp;
				}
				
			}
		}

		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
				

		}
	}
		

	


