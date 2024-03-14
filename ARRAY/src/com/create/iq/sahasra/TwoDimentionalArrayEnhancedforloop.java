 package com.create.iq.sahasra;

public class TwoDimentionalArrayEnhancedforloop {

	public static void main(String[] args) {
       int a[][]=new int[2][2];
       a[0][0]=1;
       a[0][1]=2;
       a[1][0]=3;
       a[1][1]=4;
      for( int my[]:a) {
    	  for(int j:my) {
    	 
 
    		  System.out.print(j+" ");
    	  
    	  }
    	  System.out.println();
      }
	}
} 

