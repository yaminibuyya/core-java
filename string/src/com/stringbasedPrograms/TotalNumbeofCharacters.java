package com.stringbasedPrograms;

public class TotalNumbeofCharacters {

	public static void main(String[] args) {
		String s1="be Love my parents";
		//System.out.println(s1.length()); 
		int count=0;int i;
		 for(i = 0; i < s1.length(); i++) { 
			 if(s1.charAt(i)!=' ') 
			 count++;	
		}
		 
		 System.out.println(count++);

	}

}
