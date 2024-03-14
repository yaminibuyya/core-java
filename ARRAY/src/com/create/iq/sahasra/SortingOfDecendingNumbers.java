package com.create.iq.sahasra;

public class SortingOfDecendingNumbers {

	public static void main(String[] args) {


	int num	[]= {3,7,5,4,2,9};
	
	for(int i=0; i<num.length; i++) {	
		for(int j=i+1; j<num.length; j++) {
			int temp=0;
			if(num[i]<num[j]) {
				 temp=num[i];
				 num[i]=num	[j];
				 num[j]=temp;
				
			}
			
		}
	}
	for(int i=0; i<num.length; i++) {
		System.out.println(num[i]);
	}
	
}


	}


