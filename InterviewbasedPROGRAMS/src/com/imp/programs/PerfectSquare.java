package com.imp.programs;


public class PerfectSquare {
	public static void main(String[] args) {
			int nmbr=64;
			
			int sr=(int) Math.sqrt(nmbr);
			int d=sr*sr;
			if(nmbr==d) {
				System.out.println("perfect");
			}else {
				System.out.println("not");
			}
			
			

}
}