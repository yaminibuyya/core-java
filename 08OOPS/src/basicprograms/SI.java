package basicprograms;

	public class SI {

		public double simpleInterest(double p,double t,double r) {
			double simpleinterest= (p*t*r)/100;
			return simpleinterest;
		}

		public static void main(String[] args) {
			SI demo =new SI();
			System.out.println(demo.simpleInterest(2000,4 , 5.6));
		}

		}



