package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapdemo {
	 public static void main(String[] args) {
		Map<Integer,String> mp=new LinkedHashMap();
		mp.put(105, "sahasra");
		mp.put(106, "yamini");
		mp.put(107, "sravani");
		mp.put(108, "vamsi");
		mp.put(109, "anudeep");
		//System.out.println(mp);
		
		 HashMap<String,String> capitals=new HashMap<>();
			capitals.put("India", "Newdelhi");
			capitals.put("England", "London");
			capitals.put("Russia", "Moscow");
			capitals.put("Southkorea", "Seoul");
			capitals.put("Japan", "Tokyo");
			System.out.println(capitals);
			
			HashMap combining=new HashMap(mp);
			combining.putAll(capitals);
			System.out.println(combining);
	}  

}
