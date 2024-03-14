package com.createiq;

public class DenominationOfNotes {

	public static void main(String[] args) {
		int amount = 5797;
		int n500=0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0;
		
		
		if(amount >=500) {
			n500 = amount/500;
			amount -= n500*500;
			System.out.println("no of 500 notes : "+n500);
		}
		if(amount >=100) {
			n100 = amount/100;
			amount -= n100*100;
			System.out.println("no of 100 notes : "+n100);
		}
		if(amount >=50) {
			n50 = amount/50;
			amount -= n50*50;
			System.out.println("no of 50 notes : "+n50);
		}
		if(amount >=20) {
			n20 = amount/20;
			amount -= n20*20;
			System.out.println("no of 20 rupee notes : "+n20);
		}
		if(amount >=10) {
			n10 = amount/10;
			amount -= n10*10;
			System.out.println("no of 10 rupee notes : "+n10);
		}
		if(amount >= 5) {
			n5 = amount/5;
			amount -= n5*5;
			System.out.println("no of 5 rupee notes : "+n5);
		}
		if(amount >=2) {
			n2 = amount/2;
			amount -= n2*2;
			System.out.println("no of 2 rupee notes : "+n2);
			
		}

	}

}
