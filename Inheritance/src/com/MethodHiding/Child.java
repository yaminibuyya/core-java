package com.MethodHiding;

public class Child  extends parent{

	@Override
	void m1() {
		super.m1();
		System.out.println("child method");
	}
//	
//	static void doo() {
//     System.out.println("child doo");
//}
}
