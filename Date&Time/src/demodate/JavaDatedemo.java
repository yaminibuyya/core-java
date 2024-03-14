package demodate;

import java.util.Date;

public class JavaDatedemo {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);//generated present date
		
		long minutes=1234535678;
		Date date2=new Date(minutes);
		System.out.println(date2);
		
		Date date3=new Date(2023,01 ,20);
		System.out.println(date3);
//		
//		
		String mydate="2023/01/21";
		Date date4=new Date(2023/01/21);
		System.out.println(date4.parse(mydate));
	}

}
