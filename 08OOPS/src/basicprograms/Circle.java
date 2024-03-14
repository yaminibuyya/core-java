package basicprograms;

public class Circle {
public double area() {
	double radius=4;
	double area= 2*3.14*radius;
	return area;
	
}
public static void main(String[] args) {
	Circle demo =new Circle();
	System.out.println(demo.area());
}
}
