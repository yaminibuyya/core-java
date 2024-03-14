package basicprograms;

public class floatAddition {

	public float add(float a,float b) {
		float c =a+b;
		//System.out.println(c);  OR
		return c;
	}
	public static void main(String[] args) {
		floatAddition demo=new floatAddition();
		System.out.println(demo.add(3.4f, 3.6f));
	}

	
	
}
