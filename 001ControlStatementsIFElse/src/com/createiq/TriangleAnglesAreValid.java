package com.createiq;

public class TriangleAnglesAreValid {

	public static void main(String[] args) {
		int angle1=10,angle2=80,angle3=90,sum;
				
		 sum = angle1+angle2+angle3;

	if(sum==180 && angle1 >0 && angle2 >0 && angle3 >0) {
		System.out.println("Triangle is valid");
	}
	else {
		System.out.println("Triangle is not valid");
	}
	}

}
