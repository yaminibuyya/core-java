package Com.ArrayList;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
	
	ArrayList<int[]> al=new ArrayList<>();
	//al.add(89,null);
	try {
		al.add(89,null);
		
	} catch (IndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
//	al.add(98);
	System.out.println(al);

}
}