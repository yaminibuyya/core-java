package Dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


	public class SimpleParseToDate {
		public static void main(String[] args) {
			
			
//			Date d=new Date();
//			SimpleDateFormat sdf=new SimpleDateFormat();
//			String	s=sdf.format(d);
//			System.out.println(s);
//			try {
//				Date d1=sdf.parse(s);
//				System.out.println(d1);
//			} catch (ParseException e) {
//				
//			}
//			
//			SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-DD");
//			try {
//				Date d2=sdf1.parse("2023-03-10");
//				System.out.println(d2);
//			} catch (ParseException e) {
//				
//			}
//			
//			SimpleDateFormat sdf3=new SimpleDateFormat();
//			try {
//				Date d4=sdf3.parse(s);
//				System.out.println(d4);
//			} catch (ParseException e) {
//				
//			}
			
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date=formatter.parse("1997-04-29");
				System.out.println(date);
			} catch (ParseException e) {
				
			}
			
			
			 
			

}

}



