package com.create.iq.sahasra;

public class JaggedArray {
                                                                                                                                                               
	public static void main(String[] args) {
			      int[][][]array4D = new int [4][4][2];
	      array4D [0][0][0]=0;
	      array4D [0][0][1]=1;
	      array4D [0][0][2]=2;
	      array4D [0][1][0]=3;
	      array4D [0][1][1]=4;
	      array4D [0][1][2]=5;
	      array4D [0][1][0]=6;
	      array4D [0][2][0]=7;
	      array4D [0][2][1]=8;
	      for(int i=0;i<array4D.length;i++) {
	    	  for(int j=0;j<array4D[i].length;j++) {
	    		  for(int k=0;k<array4D[j].length;k++) {
	    			  for(int l=0;l<array4D[k].length;l++) {
	    		 
	    			 System.out.print(array4D[i][j][k]+" ");
	    		  
	    		  }  
	      }
	      
	    	  System.out.println();
	}
	    	  
}
}
}