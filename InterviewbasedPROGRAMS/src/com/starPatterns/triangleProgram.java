package com.starPatterns;

public class triangleProgram {
	public static void main(String[] args) {
		
	
	 for(int i=1; i<=5;i++) {         // it is nested for loop first loop acts like door for a task after completing of inner task 
  	   for(int j=1; j<=i;j++) {     // or failing task only it will come out soo...i=1;1<5  so it is true it will give key to 
  		   System.out.print('*');    //inner loop j=1;1<=1-->true
  		                               //       print *
  	   }                               // next j incremented to 2  but 2<=1(false) so it will come out of loop
  	   System.out.println();          //print new line-->println
     }         
}
}