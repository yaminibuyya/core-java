package com.createiq;

public class LeapYear {
	public static void main(String args[]) {
		int year =2001;
		
		if(year%4==0 && year%100!=0) {
			System.out.println(year+ " : It is leap year");
		}
		else if(year%400==0) {
			System.out.println(year+ " : It is leap year");
		}
			else {
				System.out.println("this year " +year+ " : It is not leap year");
			
			}
		}
	}


