package hashset;

import java.util.HashSet;

public class hashsetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashSet = new HashSet();
		hashSet.add("Alhg");
		hashSet.add("Alhg ");
		hashSet.add("C");
		hashSet.add(67);
		hashSet.add(null);
		//hashSet.add(null);previous value is overrite by updated value 
		
		System.out.println(hashSet);

	}
}
