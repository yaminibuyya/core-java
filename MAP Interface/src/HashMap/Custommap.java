package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Custommap {

	public static void main(String[] args) {
		Mobile m1=new Mobile(876, "Realme", 150000);
		Mobile m2=new Mobile(877, "Iphone", 200000);
		Mobile m3=new Mobile(878, "Moto", 160000);
		Mobile m4=new Mobile(879, "Samsung", 250000);
		Mobile m5=new Mobile(880, "Nokia", 100000);
		
		HashMap hashmap=new HashMap();
	    hashmap.put(1, m1);
	    hashmap.put(2,m2);
	    hashmap.put(3, m3);
	    hashmap.put(4,m4);
	    hashmap.put(5,m5);
	    System.out.println(hashmap);
	    
	    Set entryset=hashmap.entrySet();
	    Iterator itr=entryset.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
		
	}
 
}
