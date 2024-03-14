package com.createiq;

public class FindGrossSalaryAndBasicSalary {
	public static void main(String[] args) {
		int basicsalary =22000;
		double hra,da,gross;
		
		if(basicsalary <= 10000) {
			hra = basicsalary * 0.2;
			da = basicsalary * 0.8;
			gross=basicsalary+hra +da;
			System.out.println("gross of the salary:"+gross);
		}
		else if(basicsalary <=20000) {
			hra = basicsalary * 0.25;
			da = basicsalary * 0.9;
			gross= basicsalary+hra +da;
			System.out.println("gross of the salary:"+gross);
		}
		else if(basicsalary >=20001) {
			hra = basicsalary * 0.3;
			da = basicsalary * 0.95;
			gross= basicsalary+hra +da;
			System.out.println("gross of the salary:"+gross);
		}
		
		
			
			
			
		}
	}



