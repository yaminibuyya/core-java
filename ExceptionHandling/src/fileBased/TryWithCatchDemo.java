package fileBased;

public class TryWithCatchDemo {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Zero can be divided by number");
			//System.out.println(ae.getMessage());
			//final block will be terminated by using this
			System.exit(0);
		}
		
		finally {
			System.out.println("finally block");
		}
			
		

	}

}
