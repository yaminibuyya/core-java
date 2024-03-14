package com.create.iq;

public class Suprise {

	public static void main(String[] args) {
		int i,j;
		for( i=0;i<=3;i++) {
		for(j=0;j<=7;j++) {
			
		if((i==0&&j==3)||(i==1&&j==4)||(i==2&&j==7)) {
		System.out.print("H");
		}
		if((i==0&&j==4)||(i==1&&j==6)||(i==2&&j==4)) {
			System.out.print("A");
		}
		if((i==0&&j==5)||(i==0&&j==6)) {
			System.out.print("P");
		}
		if((i==0&&j==7)||(i==1&&j==7)) {
			System.out.println("Y");
		}
		if((i==1&&j==0)){
          System.out.print("B");
		}
		if((i==1&&j==1)||(i==2&&j==2)) {
			System.out.print("I");
			}
		if((i==1&&j==2)||(i==2&&j==1)) {
			System.out.print("R");
			}
		if((i==1&&j==3)||(i==2&&j==6)) {
			System.out.print("T");
		}
		if((i==1&&j==5)){
	          System.out.print("D");
			}
		if((i==2&&j==0)) {
			System.out.print("S");
		}
		if((i==2&&j==3)){
	          System.out.print("K");
			}
		if((i==2&&j==5)){
	          System.out.print("N");
			}
		if((i==3&&j==2)){
        System.out.print("S");
		}
		if((i==3&&j==3)){
	        System.out.print("I");
		}
		if((i==3&&j==4)){
	        System.out.print("R");
		}
		else {
			System.out.print(" ");
		}
		
		
		}
		}
	}
}
		
		
		
		
		
		
	
