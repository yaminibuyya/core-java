package com.create.iq.sahasra;

public class JaggedArrayDynamicEnhanced {

	public static void main(String[] args) {
		int arr[][] = new int[3][]; 
		  arr[0] = new int[]{9,1,2};
	       arr[1] = new int[]{3,4,5,6};
	       arr[2] = new int[]{7,8};
	       for(int my[]: arr) {
	    	   for(int num:my) {
	    		   System.out.print(num +" ");
	    	   }
	    	   System.out.println();
	       }
	 

	}

}
