package com.USE.A;


	public class Customers implements Comparable<Customers>{
		
		private int id;
		private String firstName;
		private String lastName;
		private double points;
		
		
		public Customers() {
			
		}
		

		public Customers(int id, String firstName, String lastName, double points) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.points = points;
		}
		


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public double getPoints() {
			return points;
		}


		public void setPoints(double points) {
			this.points = points;
		}
		


		@Override
		public String toString() {
			return "Customers [id=" + id + ", " + (firstName != null ? "firstName=" + firstName + ", " : "")
					+ (lastName != null ? "lastName=" + lastName + ", " : "") + "points=" + points + "]";
		}


		@Override
		public int compareTo(Customers that) {
			return this.getId()-(that.getId());//for numbers we use - logic
			//return this.getFirstName().compareTo(that.getFirstName());//for string like we have to use compareto
			//return this.getLastName().compareTo(that.getLastName());
			//return (int) (this.getPoints()-that.getPoints());
		}

	}


