package com.createiq;

public class DaysweeksYears {

	public static void main(String[] args) {
		int days = 401;
		int years = days/365;
		int weeks =  (days-365)/7;
		int RemainingDays = (days-((years*365)+(weeks*7)));
		
		System.out.println("No.of years: "+years);
		System.out.println("No.of Weeks: "+weeks);
		System.out.println("No.of days: "+RemainingDays);
				

	}

}
