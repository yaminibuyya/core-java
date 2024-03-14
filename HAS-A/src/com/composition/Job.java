package com.composition;

public class Job {
		 public String role;
		public int salary;
		private int id;
		static int a=10;
		
		public Job(String role,int salary,int id) {
			this.role=role;
		this.salary=salary;
		this.id=id;
}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		
		
}