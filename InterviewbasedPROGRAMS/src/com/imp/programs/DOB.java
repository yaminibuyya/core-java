package com.imp.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DOB {
	public static void main(String[] args) {
		Date d =new Date();
		//converting date to defined format
		SimpleDateFormat sdf =new SimpleDateFormat(" dd/MM/yyyy");
		//we get required format
		try {
			Date d1=sdf.parse("29/04/1997");//string to date format
			System.out.println(d1);
		} catch (ParseException e) {
			
		}
		
	}

}
