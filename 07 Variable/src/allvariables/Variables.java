package allvariables;

public class Variables {
	int a=1010;
	static int b=30;
	public static void main(String[] args) {
		int c=40;
		System.out.println("Local variable is: "+c);//for local variable with in method only we can access it bcz its scope only inside the method.
		
		System.out.println("Static Variable is: "+b);// static variable with out instance/object creation we can access it
		Variables v=new Variables();
		System.out.println(v.a);
	}

}
