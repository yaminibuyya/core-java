package com.createiq;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double  principle = 200,rate=4.5, time =5;
      double CI = principle* Math.pow((1+rate/100),time);
      System.out.println("CI: "+CI);
      
	}

}
