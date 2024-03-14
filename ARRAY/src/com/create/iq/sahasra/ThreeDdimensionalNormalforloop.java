package com.create.iq.sahasra;

public class ThreeDdimensionalNormalforloop {

	public static void main(String[] args) {
 		
			 int array3D[][][]=new int[2][3][3];
			 array3D[0][0][0]=1;
			 array3D[0][0][1]=2;
			 array3D[0][0][2]=3;
			 array3D[0][1][0]=4; 
			 array3D[0][1][1]=5;
			 array3D[0][1][2]=6;
			 array3D[0][2][0]=7;
			 array3D[0][2][1]=8;
			 array3D[0][2][2]=9;
			 array3D[1][0][0]=1;
			 array3D[1][0][1]=2;
			 array3D[1][0][2]=3;
			 array3D[1][1][0]=4; 
			 array3D[1][1][1]=5;
			 array3D[1][1][2]=6;
			 array3D[1][2][0]=7;
			 array3D[1][2][1]=8;
			 array3D[1][2][2]=9;
					
		       for(int i=0;i<array3D.length;i++) {
		    	   
		    	   for(int j=0;j<array3D[i].length;j++) {
		    		   
		    		   for(int k=0;k<array3D[i][j].length;k++) {
		    			 
		    			   
		    		   System.out.print(array3D[i][j][k]+" ");
		    		   
		    		   
		    		  // System.out.print("***************");
		    		   System.out.print(array3D[0][0][1]);
		    	   }
		    		   
		    	   System.out.println();

	}
	       

}
}
}