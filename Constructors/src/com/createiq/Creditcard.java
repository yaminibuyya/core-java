package com.createiq;

public class Creditcard{
	
      String name="Sahasra";
      int phno=994556345;
      long cardno=9876578978978L;
      public void details() {
    	  System.out.println("name:" +name);
    	  System.out.println("phno:" +phno);
    	  System.out.println("cardno:"+cardno);
      }
    	  public static void main(String[] args) {
    		  Creditcard demo = new Creditcard();
    		  demo.details();
    	  
      }
    
	}

 
