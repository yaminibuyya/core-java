package basicprograms;

public class Perimeter {
	public void perimeter(double a,double b) {
		double perimeter = 2*(a+b);
		System.out.println(perimeter);
	}

	public static void main(String[] args) {
		Perimeter demo =new Perimeter();
		demo.perimeter(4, 2);

	}

}
