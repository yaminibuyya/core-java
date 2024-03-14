package com.createiq.operators;

public class LeapYeaprogramme {
	public static void main(String args[]) {
		int year =2017;
		String result=(year%4==0 && year%100 != 0) ? ("It is leap year"):
			(year%400==0)? "It is leap year":"It is not leap year";
		System.out.println(result);
	}

}
