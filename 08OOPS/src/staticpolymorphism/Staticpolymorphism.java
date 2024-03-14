package staticpolymorphism;

public class Staticpolymorphism {
	
	public int mul(int a,int b) {
		int c=a*b;
		System.out.println(c);
		return c;
		
	}
	public int mul(int a,int b,int c) {//mul(int a,int b,int c)is method defination&parameters are formal parameters
		int d=a*b*c;
		System.out.println(d);
		return d;
		
	}

	public static void main(String[] args) {
		Staticpolymorphism sp=new Staticpolymorphism();
		sp.mul(2, 9);//binds the definition of mul(int x, int y) method with mul(2, 9) method during compilation and calls the appropriate method.
		sp.mul(2, 3, 4);//compiler binds method call with method defination.
	}
}
