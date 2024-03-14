package com.Exceptionsbased;

public class NumberFormat {

	public static void main(String[] args) {
//		String msg="abcd";
//		int number=Integer.parseInt(msg);
//		System.out.println(number);

		try{
			System.out.println("try");
			return;
			//System.out.println("try1");
		}catch (ArithmeticException e) {
			System.out.println("catch");
		}finally{
			System.out.println("Finally");
		}


}
}