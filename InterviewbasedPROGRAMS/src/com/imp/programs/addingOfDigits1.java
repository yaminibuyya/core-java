package com.imp.programs;

public class addingOfDigits1 {
     
	public int yam(int n)
    {
        int sum = 0;
        // Loop to do sum while  
        // sum is greater than or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum =sum+n % 10;
            n=n/ 10;
        }
        return sum;
    }
     
    public static void main(String args[]) {
    	addingOfDigits1 ad=new addingOfDigits1();
        System.out.println(ad.yam(687));
    }
}

