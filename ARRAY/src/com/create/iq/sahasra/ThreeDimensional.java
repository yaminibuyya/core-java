package com.create.iq.sahasra;

public class ThreeDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array3D[][][]=new int[1][3][3];
		 array3D[0][0][0]=1;
		 array3D[0][0][1]=2;
		 array3D[0][0][2]=3;
		 array3D[0][1][0]=4; 
		 array3D[0][1][1]=5;
		 array3D[0][1][2]=6;
		 array3D[0][2][0]=7;
		 array3D[0][2][1]=8;
		 array3D[0][2][2]=9;
		 for(int array2D[][]:array3D) {
			 for(int array[]:array2D){
				 for(int num:array) {
					 System.out.print(num+" ");
			 }
				System.out.println(); 
			 }
			// System.out.println();
		 }
	}

}
