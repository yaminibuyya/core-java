package com.stringbasedPrograms;

public class TotalNumberOfPuntuationCharacters {

	public static void main(String[] args) {
		int count=0;
		String s1="*well*, 'lets settle now!.'we can achieve % anything in world/.";  
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)==','||s1.charAt(i)=='!'||s1.charAt(i)=='/'||s1.charAt(i)=='.'||s1.charAt(i)=='*'||s1.charAt(i)=='%') {
        		count++;
        	}
        	
        }
        System.out.println(count++);
	}

}
