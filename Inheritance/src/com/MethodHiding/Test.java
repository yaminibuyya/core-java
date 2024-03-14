package com.MethodHiding;

public class Test {
         
	public static void main(String[] args) {

		
		parent p = new Child();
		p.m1();
		p.doo();
		//here method overriding is done  both parent and  child implementation can be seen
		
		//where as we used static method it is bound to class only because it doesn't follow run time polymorphism
		//it has compile time polymorphism because a static method is resolved at compile time by java compiler whereas,

//method overriding is resolved at runtime by JVM because objects are only available at runtime 
		
		
		
      	System.out.println("*********");
         Child c =new Child();
         c.doo();
// visibility of methods are also hidden
         
         
	}

}
