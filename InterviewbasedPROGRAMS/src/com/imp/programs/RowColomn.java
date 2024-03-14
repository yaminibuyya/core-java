package com.imp.programs;


	public class RowColomn {

	    
	    public static void main(String[] args) {
	        
	        int row= 4;
	        int a=3;
	        
	        for(int i=1;i<=row;i++) {
	        
	            for(int col=1;col<=i;col++) {
	            
	            System.out.print(a+" ");
	            a= a + 3;
	        }
	        System.out.println();
	        
	        }
	    }

}
