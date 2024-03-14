package basicprograms;

public class Triangle {
	public void area() {
		int height =40;
		int base=50;
		int area=(height*base)/2;
		System.out.println(area);
	}

	public static void main(String[] args) {
		Triangle demo=new Triangle();
         demo.area();
	}

}
