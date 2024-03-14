package com.create.iq.sahasra;

public class SortingAscendingOfNum {
public static void main(String[] args) {
	int	num	[]= {3,7,4,9,6,1};
for(int i=0; i<num.length; i++) {
	for(int j=i+1; j<num.length; j++) {
		int temp=0;

		if(num[i]>num[j]) {
			
			temp=num	[i];
			num	[i]=num	[j];
			num	[j]=temp;
		}
		
	}
}

for(int i=0; i<num.length; i++) {
	System.out.println(num[i]);
}
		

}}