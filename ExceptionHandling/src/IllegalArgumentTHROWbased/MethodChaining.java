package IllegalArgumentTHROWbased;

public class MethodChaining {

	
		public void m1() {
			System.out.println("method 1");	
			m2();
		}
		public void m2() {
			System.out.println("method 2");
			m3();
		}
		public void m3() {
			try {
			System.out.println(10/0);
			}
			catch(ArithmeticException ae) {
				System.out.println(ae.getMessage());
				System.out.println("Zeros can't be divided");
			}
			
			System.out.println("method 3");
		}
		public static void main (String[] args) {
			MethodChaining mc=new MethodChaining();
			mc.m1();
		}
		

	}


