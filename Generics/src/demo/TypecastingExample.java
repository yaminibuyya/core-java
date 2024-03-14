package demo;

import java.util.ArrayList;

public class TypecastingExample {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("moni");
		al.add("vamu");
		al.add("kettle");
		al.add("pen");
		al.add("eraser");
		String s =  (String) al.get(0);
		System.out.println(s);

		//here we dont need typecasting bcz it is already defined with generics
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.add("4");
		al1.add("5");
		String s1 = al1.get(0);
		System.out.println(s1);
		
	}

}
