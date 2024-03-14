package Com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
public class Arraylistdemo {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		System.out.println(names.isEmpty());
		names.add("sravani");
		names.add("sahasra");
		names.add("yamini");
		names.add("krishna");
		names.add("sai");
		//System.out.println(names.removeAll(names));
		System.out.println(names);
		System.out.println(names.get(3));
		System.out.println(names.remove(4));
		System.out.println(names.get(3));
		names.set(1, "sahana");
		System.out.println(names);
		int position=names.indexOf("emma");
		System.out.println(position);
		if(position !=-1) {
			names.add(1,"hello");
		}
		else {
			System.out.println("invalid name");
		}
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
			
		}
		System.out.println();
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
 