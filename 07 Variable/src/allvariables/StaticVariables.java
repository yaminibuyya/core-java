package allvariables;


	public class StaticVariables {
		static String College = "jhai";
		int id; 
		double salary;
//we can change the static variables or set the static variables by using constructor
		public StaticVariables(int id, double salary,String College) {
			this.id = id;
			this.salary = salary;
			this.College = College;

		}

		
		public void stduents() {
			System.out.println(id);
			System.out.println(salary);
			System.out.println(College);
		}

		public static void main(String[] args) {
		StaticVariables variables = new StaticVariables(1, 200000, "sathyabama");
		//	variables.stduents();
	//	StaticVariables varaibes1 = new StaticVariables(2, 23456, "jkl");
	//		varaibes1.stduents();
//			variables.stduents();
			System.out.println(College);
		}

	}

