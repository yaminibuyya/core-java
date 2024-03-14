package com.create.iq;

public class Hollowpattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((j==2&& i==2)|| (j==2 && i==3) || (j==2 && i==4)|| (j==3 && i==2)|| (j==3 && i==3)|| (j==3 && i==4) || (j==4 && i==2)||(j==4 &&i==3)||(j==4 &&i==4)){
					System.out.print(" ");
				}
					else {
						System.out.print("5");
				
				}
			}
			System.out.println();
			
		}
		
		

	}
	

}
