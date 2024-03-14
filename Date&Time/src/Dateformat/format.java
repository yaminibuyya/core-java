package Dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class format {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
//		SimpleDateFormat sdf=new SimpleDateFormat();
//		String	s=sdf.format(d);
//		System.out.println(s);
//		try {
//			Date d1=sdf.parse(s);
//			System.out.println(d1); 
//		} catch (ParseException e) {
//			
//		}
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-DD:hh-mm-ss");
		try {
			Date d2=sdf1.parse("2023-01-10");
			System.out.println(d2);
		} catch (ParseException e) {
			
		}
		
		
	//	SimpleDateFormat sdf3=new SimpleDateFormat();
//		try {
//			Date d4=sdf3.parse(s);
//			System.out.println(d4);
//		} catch (ParseException e) {
//			
//		}
//		
//		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-YYYY");
//		try {
//			Date date=formatter.parse("31/08/2023");
//			System.out.println(date);
//		} catch (ParseException e) {
//			
//		}
//		
//	
//
//	}

	}
}
