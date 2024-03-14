package com.create.iq.sahasra;

public class TwoDimensionalNormalForloop {

	public static void main(String[] args) {
		 int array2D[][]=new int[2][2];
		 array2D[0][0]=1;
		 array2D[0][1]=2;
		 array2D[1][0]=3;
		 array2D[1][1]=4; 
	       for(int i=0;i<array2D.length;i++) {
	    	   
	    	   for(int j=0;j<array2D[i].length;j++) {
	    		   System.out.print(array2D[i][j]+" ");
	    	   }
	    	   System.out.println();
	       }
	     
    }

	}


