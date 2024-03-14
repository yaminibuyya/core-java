package com.imp.programs;

public class FibonnaciSeries {
	
		    public static void main(String[] args)  {
		        int first=1;
		        int second=1;
		        int third=0;
		        System.out.println(first);
	        System.out.println(second);
		        for(int i=1;i<=10;i++) {
		            third=first+second;
		            System.out.println(third);
		            first=second;
		            second=third;
		            
		        }
		    }

		
	}


