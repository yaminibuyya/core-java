package basicprograms;

public class Addition {

	public int add () {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		Addition demo =new Addition() ;
			int result =demo.add();
			System.out.println(result);
		
	}

}
