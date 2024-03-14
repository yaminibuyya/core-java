package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericsINMap {
public static void main(String[] args) {
	

	Map<String,Integer> mp=new HashMap<>();
	mp.put("1BHK",3000);
	mp.put("2BHK",4000);
	mp.put("3BHK",50000);
	System.out.println(mp);
	
	Set<Entry<String,Integer>> s1=mp.entrySet();
	Iterator itr=s1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	

}
}