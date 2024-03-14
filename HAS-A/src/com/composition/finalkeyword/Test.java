package com.composition.finalkeyword;



public class Test {

	public static void main(String[] args) {
		
		AdvanceFeatures hpnew=new AdvanceFeatures("silver", 1.56, "5000mah");
		Laptop hp=new Laptop("HP", 55000.00, "12th Gen", hpnew);
		System.out.println(hp);
	}
}