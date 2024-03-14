package com.imp.programs;

public class armstrong {

	public static void main(String[] args) {
	int n=153;
	double Armstrong = 0;
	double temp;
	int originalnumber=n;
	
	while(n>0) {
     temp=n%10;
     temp= Math.pow(temp, 3);
     Armstrong=Armstrong+temp;
     n=n/10; 
	}
	if(Armstrong==originalnumber) {
		System.out.println("armstrong  number");
	}
	else {
		System.out.println("it is not a armstrong number");
	}
		
	}

}
