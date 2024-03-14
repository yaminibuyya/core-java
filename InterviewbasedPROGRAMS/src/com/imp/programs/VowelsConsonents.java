package com.imp.programs;

	public class VowelsConsonents {
		public static void main(String[] args) {
			int vcount=0;
			int ccount=0;
			String s="hey hi what are you doing";
			String s1=s.replace(" ", "");
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				vcount++;
				
			}else {
				ccount++;
			}
				 
			
				
			}
			System.out.println("total number of vowels are"+vcount);
			System.out.println("total number of consosnents are"+ccount);
			
			
		}

	}



