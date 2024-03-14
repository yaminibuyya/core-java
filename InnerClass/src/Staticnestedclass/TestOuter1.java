package Staticnestedclass;

	public class TestOuter1{  
		  static int data=30;
		  int b=60;
		   static String num="89";
		   void msg1(){
			   System.out.println("num is "+num);
		   }
		  static class Inner{  
			  static int b=90;
		   void msg(){
			   System.out.println("data is "+data);
			   System.out.println("b is"+b);//we can access static members in static inner classes
		   
		   //System.out.println("num is "+num);
		   }  
		  }  
		  public static void main(String args[]){ 
			  TestOuter1 obj1=new TestOuter1();  
		  TestOuter1.Inner obj=new TestOuter1.Inner();  
		  obj.msg();
		  obj1.msg1();
		  
		  }  
		}  


