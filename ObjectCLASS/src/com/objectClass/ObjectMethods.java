package com.objectClass;

public class ObjectMethods {


	public static void main(String[] args) {
		ObjectMethods om=new ObjectMethods();
		System.out.println(om.toString());
		System.out.println(om.getClass());
		System.out.println(om.hashCode());
       
		ObjectMethods om1=new ObjectMethods();
		System.out.println(om.equals(om1));
		
		ObjectMethods om3=om;
		System.out.println(om3.equals(om));
	
	}

}
 