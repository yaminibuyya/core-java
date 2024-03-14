package com.upcastingANDdowncasting;

public class TestOfDowncasting {

	public static void main(String[] args) {
         Parent p = new Child();
         Child cc= (Child)p;
         //here in down casting we can't write Child c=new Parent(); because it throws error if we cast it 
         //compile time error will be gone but it throws runtime Exception called Class cast Exception
         //so to remove it we can do downcasting
         
        System.out.println(cc.b=10);
        //here we can access parent and child both variables and methods
         
	cc.m1();
	}

}
