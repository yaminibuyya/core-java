package com.createiq;

public class FindPercentageAndGrade {

	public static void main(String[] args) {
		int physics = 50;
		int chemistry = 98;
		int biology = 70;
		int maths = 59;
		int english = 86;
		int total =physics+chemistry+biology+maths+english;
		double average = total/5;
		double percentage = (average*100)/100;
		
		if(percentage >= 90) {
			System.out.println("Got Grade :'A'");
		}
		else if(percentage >= 80) {
			System.out.println("Got Grade :'B'");
		}
		else if(percentage >= 70) {
			System.out.println("Got Grade :'C'");
		}
		else if(percentage >= 60) {
			System.out.println("Got Grade :'D'");
		}
		else if(percentage <= 40) {
			System.out.println("Got Grade :'F'");
		}
		

	}

}
