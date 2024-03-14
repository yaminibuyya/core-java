package HashMap;

import java.util.HashMap;

public class BottletTest {
	public static void main(String[] args) {
		
		
		Bottle b1=new Bottle("Blue", 100.00);
		Bottle b2=new Bottle("Black", 20.00);
		Bottle b3=new Bottle("Red", 60.00);
		Bottle b4=new Bottle("Black", 20.00);

		
		HashMap<Integer, Bottle>x=new HashMap<>();
		x.put(1, b1);
		x.put(2, b3);
		x.put(3, b2);
		x.put(4, b4);
		
		
		x.entrySet().stream().
		forEach(e ->System.out.println(e.getKey()+" "+e.getValue()));
			

				
		
		
		
		
		
		
		
		
	}

}
