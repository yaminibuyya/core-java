package demodate;

import java.util.Calendar;


public class calenderdemo {
	public static void main(String[] args) {
		 Calendar c1 = Calendar.getInstance(); 
		 Calendar cal=Calendar.getInstance();
         System.out.println(c1.getTime());
		 //to Set a date
		 c1.set(2023, 4, 25);
		 System.out.println(c1);
		 
		 System.err.println("**************");
		 
		 System.out.println("The current time: "+c1.getTime());
		 c1.add(c1.DATE,-15);
		 System.out.println("15 days ago : "+c1.getTime());
		 c1.add(c1.MONTH,1);
		 System.out.println("After one month: "+c1.getTime());
		 c1.add(c1.YEAR,1);
		 System.out.println("After one year: "+c1.getTime());
		 
		 System.err.println("*************");
		 
		 //Get Currrent time,date,year
		 System.out.println("Present year: "+c1.get(c1.YEAR));
		 System.out.println("Present Date: "+c1.get(c1.DATE));
		 System.out.println("Present Date&Time: "+c1.getTime());
		
		 System.err.println("******************");
		 //max &min
		 System.out.println(c1.getMaximum(Calendar.WEEK_OF_YEAR));
	     System.out.println(c1.getMaximum(Calendar.DAY_OF_MONTH));
	     System.out.println(c1.getMinimum(Calendar.DAY_OF_MONTH));
	     System.out.println(c1.getMinimum(Calendar.DAY_OF_WEEK_IN_MONTH));
	 	System.out.println(c1.getActualMaximum(Calendar.YEAR));
	 	System.out.println(c1.getActualMinimum(Calendar.YEAR));
	 	
	 	System.err.println("*************");
//	 	Types Of Calendars
	 	System.out.println(c1.getCalendarType());
	 	System.out.println(c1.getAvailableCalendarTypes());
	 	
	 	System.err.println("****************");
//	 	other Methods
	 	System.out.println(c1.getTime().clone());
	 	System.out.println(c1.compareTo(c1));//if we compare with other calendar ref objects it returns 1
	 	System.out.println(c1.getTimeInMillis());
	 	System.out.println(c1.hashCode());
	 	System.out.println(c1.isLenient());
	 	System.out.println(c1.toString());
	 	System.out.println(c1.getClass());
	 	System.err.println("**********");
	     c1.clear();
	     System.out.println(c1.getTime());
	}
	
  
}
