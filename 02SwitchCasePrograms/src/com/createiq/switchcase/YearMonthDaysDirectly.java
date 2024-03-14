package com.createiq.switchcase;

public class YearMonthDaysDirectly {

	public static void main(String[] args) {
		 int month=2;
		 int year= 2004;
		 int noofdays =0;
		 
		 switch(month) {
		 case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			 noofdays = 31;
			 System.out.println( " No of days :" +noofdays);
			 break;
		 case 4: case 6: case 9 : case 11:
			 noofdays = 30;
			 System.out.println("No of days : "+noofdays);
			 break;
		 case 2:
			 if((year%4==0 && year%100!=0)||year%400==0) {
				 noofdays = 29;
				 System.out.println("It is february");
				 System.out.println("no of days of this month :"+noofdays);
				 System.out.println("It is leap year");
				 break;
			 }
				 else {
					 noofdays = 28;
					 System.out.println("no of days:"+noofdays);
				break;	 
			 }
			 default:
				 System.out.println(" it is invalid month number: " +month);
				 break;
		
				 
				 
			 
		 }

	}

}
