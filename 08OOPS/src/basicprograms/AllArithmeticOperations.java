 package basicprograms;

public class AllArithmeticOperations {
	public int add(int a,int b,int c) {
	int add=a+b+c;
	return add;
	}
	public int sub() {
		int a=4;
		int b=2;
		int sub=a-b;
		return sub;
		
	}
	public void multiply(int a,int b) {
		int multiply = a*b;
		System.out.println(multiply);
		
	}
	public void division() {
		int a=16;
		int b=4;
		int division=a/b;
		System.out.println(division);
		
	}

	public static void main(String[] args) {
		AllArithmeticOperations demo = new AllArithmeticOperations();
		System.out.println(demo.add(23,10,7));
		System.out.println(demo.sub());
		demo.multiply(4, 14);
		demo.division();

	}

}
