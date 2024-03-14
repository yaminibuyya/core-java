package com.createiq;

public class Own2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,7,8,9};
		int b=0;
		for(int i=0;i<a.length;i++) {
			if (a[i]==0) {
			System.out.print(a[i]);
			}
			if (a[i]!=0) {
				b++;
			}
			if(b==a.length) {
				System.out.println("*");
			}
		}
		
//		if ( j!=6 ) {
//			System.out.print("*");
//		}
//			
		}
	
}
	


