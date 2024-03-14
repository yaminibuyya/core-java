package searchingBasedprograms;

	public class Student {
		private int id ;
		private String name;
		private double fees;
		private int rollnumber;
		
		public Student(int id, String name, double fees, int rollnumber) {
			super();
			this.id = id;
			this.name = name;
			this.fees = fees;
			this.rollnumber = rollnumber;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getFees() {
			return fees;
		}
		public void setFees(double fees) {
			this.fees = fees;
		}
		public int getRollnumber() {
			return rollnumber;
		}
		public void setRollnumber(int rollnumber) {
			this.rollnumber = rollnumber;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", rollnumber=" + rollnumber + ", getId()="
					+ getId() + ", getName()=" + getName() + ", getFees()=" + getFees() + ", getRollnumber()="
					+ getRollnumber() + "]";
		}
		
		
	   



}
