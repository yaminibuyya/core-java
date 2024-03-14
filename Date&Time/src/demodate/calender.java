package demodate;

import java.util.Calendar;

public class calender {
	public static void main(String[] args) {
		
	
	Calendar cal=Calendar.getInstance();
	System.out.println(cal.getTime());
	System.out.println(cal.getTime().clone());
	
	System.out.println(cal.compareTo(cal));
	System.out.println(cal.get(Calendar.YEAR)+"--> 4");
	System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
	System.out.println(cal.getActualMaximum(Calendar.YEAR));
	System.out.println(cal.getMaximum(Calendar.DAY_OF_YEAR)+"---> 8");
	System.out.println(cal.getMaximum(Calendar.WEEK_OF_YEAR));
	System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH));
	System.out.println(cal.get(Calendar.ALL_STYLES));
	System.out.println(cal.get(Calendar.AM)+"---> 12");
	System.out.println(cal.get(Calendar.AM_PM));
	System.out.println(cal.get(Calendar.APRIL));
	System.out.println(cal.get(Calendar.AUGUST));
	System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"--> 16");
	System.out.println(cal.getMinimalDaysInFirstWeek());
	System.out.println(cal.getMinimum(Calendar.DAY_OF_MONTH));
	System.out.println(cal.getMinimum(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println(cal.getActualMinimum(Calendar.DAY_OF_WEEK_IN_MONTH)+"---> 20");
	System.out.println(cal.getGreatestMinimum(Calendar.DAY_OF_MONTH));
	System.out.println(cal.getActualMinimum(Calendar.DAY_OF_WEEK));
	System.out.println(cal.getCalendarType());
	System.out.println(cal.getFirstDayOfWeek()+"---> 24");
	System.out.println(cal.getMinimalDaysInFirstWeek());
	System.out.println(cal.getTimeInMillis());
	System.out.println(cal.getWeeksInWeekYear());
	System.out.println(cal.hashCode()+"---> 28");
	System.out.println(cal.isLenient());
	System.out.println(cal.isLenient());
//	cal.set(2024, 3, 10, 12, 12, 12);
	System.out.println(cal.isWeekDateSupported());
	System.out.println(cal.toString()+"---> 32");
	System.out.println(cal.getClass());
	System.out.println(cal.getTime());
	System.out.println(cal.getTimeZone());
	System.out.println(cal.ALL_STYLES +"---> 36");
	System.out.println(cal.getAvailableCalendarTypes());
	cal.add(Calendar.DATE, -15);
	System.out.println(cal.getTime());
	cal.add(Calendar.DAY_OF_MONTH, 4);
	System.out.println(cal.getTime());
	cal.clear();
	System.out.println(cal.getTime());
	
	
	

}
}
