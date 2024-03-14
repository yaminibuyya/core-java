package com.create.iq.sahasra;

import java.util.Arrays;

public class binarySearch {
	public static void main(String[] args) {
		int	[]a= {21,22,23,24,25};
		boolean flag=false;
		
		int key=23;
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h) {
			int m=(l+h)/2;
			
			if(a[m]==key){
				System.out.println("number is found");
				flag=true;
				break;
			}
			if ( a[m]<key) {
				l=m+1;
				
			}
			if (a[m]>key) {
				h=m-1;
			}
			if(flag==false) {
				System.out.println("number is not found");
			}
			System.out.println(Arrays.binarySearch(a, 21));
		}

	}
}
