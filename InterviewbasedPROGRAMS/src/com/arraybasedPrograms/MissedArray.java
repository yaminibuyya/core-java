package com.arraybasedPrograms;

import java.util.Arrays;

public class MissedArray {
	  public static int  MissingNumber(int[] arr)
	    // Function to get missing number
	    {
	        int n=arr.length;
	int m=n+1;
	        int sum1=((m)*(m+1))/2;
	        int sum2 = 0;
	        for(int i=0;i<n;i++)
	          sum2+=arr[i];
	        return sum1-sum2;
	    }
	    public static void main(String[] args)
	    {
	        int[] arr = { 1,3};
	        System.out.println(MissingNumber(arr));
	    }
	    
	    
	    
//	 // Find the missing number in a given array
//    public static int getMissingNumber(int[] arr)
//    {
//        // get the array's length
//        int n = arr.length;
// 
//        // the actual size is `n+1` since a number is missing from the array
//        int m = n + 1;
// 
//        // get a sum of integers between 1 and `n+1`
//        int total = m * (m + 1) / 2;
// 
//        // get an actual sum of integers in the array
//        int sum = Arrays.stream(arr).sum();
// 
//        // the missing number is the difference between the expected sum
//        // and the actual sum
//        return total - sum;
//    }
// 
//    public static void main(String[] args)
//    {
//        int[] arr = { 1, 2, 3, 4, 5,6,7,8, 10 };
// 
//        System.out.println("The missing number is " + getMissingNumber(arr));
//    }
//
//	   
}
