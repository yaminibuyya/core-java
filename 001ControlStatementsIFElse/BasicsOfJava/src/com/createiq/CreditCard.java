package com.createiq;

public class CreditCard {
	public static void main(String [] args){
		
		long cardnumber = 894234567876L;
		String name = "sahasra";
		String expirydate = "12/28";
		String signature = "y@MiNi";
		byte cvc = 123;
		
		System.out.println("Card Number: "+cardnumber);
		System.out.println("Card Holder Name: "+name);
		System.out.println("Expiry Date: "+expirydate);
		System.out.println("Signature: "+signature);
		System.out.println("CVC: "+cvc);

}
}