package com.printWriter;

import java.io.PrintWriter;

import Sequencebased.vehicle;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw=new PrintWriter(System.out);
		pw.println("hello");
		pw.println("sahasra");
		pw.println(78788);
		pw.println('y');
		pw.println(89.0f);
		vehicle ve=new vehicle("rangerover", 8900000,"white");
		pw.println(ve);
		pw.close();					
		
		
		
		
		
		
		

	}

}
