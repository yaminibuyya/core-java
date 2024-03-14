package com.createiq;

public class SimpleInterestfor4years8months {
	public static void main(String[] args) {
		int principle = 50;
		int rate = 6;
		double time = 5;
		double si = (principle*time*rate)/100;
		double amount = principle+si;
		System.out.println("simple interest: "+(si));
		System.out.println("AMOUNT: "+(amount));
	}
	 
	

}
