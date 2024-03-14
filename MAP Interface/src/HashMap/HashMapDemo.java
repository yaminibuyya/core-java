package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Object, Object> capitals=new HashMap<>();
		System.out.println(capitals.isEmpty());
		System.out.println(capitals.size());
		capitals.put("India", "Newdelhi");
		capitals.put("England", "London");
		capitals.put("Russia", "Moscow");
		capitals.put("Southkorea", "Seoul");
		capitals.put("Japan", "Tokyo");
		capitals.put(null, null);
		capitals.put(null, null);
		//it can take heterogenous object too
		capitals.put(89, "mani");
		//capitals.remove("England");
		//capitals.remove("Japan","Tokyo");
		System.out.println(capitals.containsKey("India"));
		System.out.println("********************");
		System.out.println(capitals);
		System.out.println("********************");
		
		Set entryset=capitals.entrySet();
		Iterator itr=entryset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******************");
		System.out.println(capitals.containsKey("Japan"));
		System.out.println("*******************");
		if(capitals.containsKey("India")) {
			System.out.println(capitals);
		}
			else {
				System.out.println("wrong data");
			}
		
		}
	
	
		
	
	
		
		
	}


