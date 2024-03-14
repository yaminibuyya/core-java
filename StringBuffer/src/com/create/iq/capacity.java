package com.create.iq;

public class capacity {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
				System.out.println(s1.capacity());
				s1.append("hello");
				System.out.println(s1.capacity());
				s1.append("java is my core we have to learn");
				System.out.println(s1.capacity());
				s1.append("work hard to get placed in job");
				System.out.println(s1.capacity());
				
				
				s1.ensureCapacity(10);
				s1.ensureCapacity(50);

				
	}

}
