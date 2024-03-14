package com.create.iq;

public class SumOfNthNumbers {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=100;i++) {    //first initialcondition i=0 its true ,second condition is0 is <100 it is also true 
			sum=sum+i;                   //sooo...it will go to second statement sum = 0+i
			System.out.println(+sum);                               //                =0+0=0
		}
	                                                 //i=1 satisfies first and second condition sum =0+i
		                                                       //                                   =0+1=1-->=1(sum)
	}                                                //i=2 satisfies first and second condition sum =sum+i
                                                               //                                   =1+2=3-->=3(sum)
	                                                 //i=3 satisfies first and second condition sum =sum+i
                                                               //                                   =3+3=6-->=6(sum)
	                                                 //i=4 satisfies first and second condition sum =sum+i
                                                               //                                   =6+4=10-->=10(sum)

}
