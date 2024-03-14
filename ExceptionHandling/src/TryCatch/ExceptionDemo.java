package TryCatch;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
//		System.out.println(10/2);
//		System.out.println(10/0);//we get java lang Arithemetic error
//		System.out.println("statement 4");
//		System.out.println("statement 5");
//		
//		System.out.println("statement 1");
//		System.out.println("statement 2");
//		System.out.println("statement 3");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			//System.out.println(ae.getMessage());
			//System.out.println("zero can't be divided by number");
			
		}
		System.out.println("statement 4");
		System.out.println("statement 5");
		
	}

}
