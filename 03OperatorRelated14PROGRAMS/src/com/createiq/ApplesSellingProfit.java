package com.createiq;

public class ApplesSellingProfit {
public static void main(String[] args) {
		
		int numofapples = 0;
		int numofcustomers = 0;
		double profit = 0;
		
		System.out.println("you picked 500 apples from an apple orchard");
		numofapples += 500;
		
		System.out.println("time for business! you're selling each apple for 40 cents");
		double price= 0.40;
		
		
		System.out.println("one customer walked in. he bought 4 apples!");
	    numofapples -=4;
	    numofcustomers++;
	    profit += 4*price;
	    
	    System.out.println("another customer walked in. he bought 20 apples!");
	    numofapples -=20;
	    numofcustomers++;
	    profit += 20*price;
	    
	    System.out.println("another customer walked in. he bought 4 apples!");
	    numofapples -=200;
	    numofcustomers++;
	    profit += 200*price;
	    
	    System.out.println("Wow! so far, you made: $" + profit);
	    System.out.println(numofcustomers + "customers love your apples.");
	    System.out.println("you have" + numofapples + "apples left. we'll sell more tommorrow!");
}

}
