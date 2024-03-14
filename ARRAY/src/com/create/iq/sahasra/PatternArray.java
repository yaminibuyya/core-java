package com.create.iq.sahasra;

public class PatternArray {

	public static void main(String[] args) {
	int array[][][][]= {{{{3},{6,9},{12,15,18},{21,24,27,30}}}};
	 for(int i=0;i<array.length;i++) {
		 for(int j=0;j<array[i].length;j++) {
			 for(int k=0;k<array[i][j].length;k++) {
				 for(int l=0;l<array[i][j][k].length;l++) {
					 
					 System.out.print(array[i][j][k][l] +" ");
				 }
				 System.out.println();
			 }
		 }
		 
	 }

	}
 
}
