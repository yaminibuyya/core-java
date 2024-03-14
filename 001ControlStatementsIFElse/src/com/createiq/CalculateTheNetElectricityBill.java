package com.createiq;

public class CalculateTheNetElectricityBill {

	public static void main(String[] args) {
		int units = 150;
		double amount,surcharge,Totalamount;
		
		if(units <= 50) {
			amount = units*0.50;	
		}
		else if(units <= 150) {
			amount = (50*0.50)+((units-50)*0.75);
		}
		else if (units <= 250) {
			amount = (50*0.50)+(100*0.75)+((units-150)*1.20);
		}
		else {
			amount = (50*0.50)+(100*0.75)+(100*1.20)+((units-250)*1.50);
		}
		
		surcharge = amount*0.20;
		Totalamount=surcharge+amount;
		System.out.println("the net electricity bill:"+Totalamount);
		

	}

}
