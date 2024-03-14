package com.create.iq;

public class reverseOfParticularString {
	public static void main(String[] args) {
		String name="sahasra is taking coaching in create iq ";
        StringBuilder reverse=new StringBuilder(name.substring(0, 7) ).reverse();
        StringBuilder re=new StringBuilder(name.substring(7,10)).reverse();
        StringBuilder r1=new StringBuilder(name.substring(10,17) ).reverse();
        StringBuilder r2=new StringBuilder(name.substring(17, 26) ).reverse();
        StringBuilder r3=new StringBuilder(name.substring(26, 29) ).reverse();
        StringBuilder r4=new StringBuilder(name.substring(29,36 ) ).reverse();
        StringBuilder r5=new StringBuilder(name.substring(36,39 ) ).reverse();
        
        
        System.out.println(reverse+" ");
        System.out.println(re +" ");
        System.out.println(r1 +" ");
        System.out.println(r2 +" ");
        System.out.println(r3 +" ");
       System.out.println(r4 +" ");
        System.out.println(r5 +" ");
        
        
        //System.out.println(reverse.append(name.substring(6,11)));
        //System.out.println(re.append(name.substring(6,11)));
	}

}
