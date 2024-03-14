package LinkedListBased;

import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> currency=new LinkedList<String>() ;
	//currency.remove();
		currency.add("Ruppe");
		currency.add("Won");
		currency.add("Dinar");
		currency.add("Pounds");
		currency.add("Bhats");
		currency.add("Dinar");
		currency.add("Rubel");
	
		//
		currency.addFirst("Shilling");
		currency.addLast("Yuan");
		//for removing first &last elements
		currency.removeFirst();
		currency.removeLast();
		//to get elements first &last which was deleted
		currency.getFirst();
		currency.getLast();
		//
		System.out.println(currency);
		System.out.println("********************");
		Iterator<String> itr=currency.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			if(currency.contains("Pounds")) {
				itr.remove();
				
			}
			//currency.remove();
			
		}
		//we use contains for searching
		if(currency.contains("Dinar")) {
			currency.add("Dollar");
		System.out.println(currency);
		}
		LinkedList<String> country=new LinkedList<String>();
		country.add("India");
		country.add("Southkorea");
		country.add("Russia");
		country.add("England");
		
		LinkedList<String> knowledge=new LinkedList(country);
		knowledge.addAll(currency);
		System.out.println(knowledge);
	
}
}

