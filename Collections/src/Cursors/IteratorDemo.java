package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

import createiq.student;


	public class IteratorDemo {
		public static void main(String[] args) {
			
		
		ArrayList<Object> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add(78);
		fruits.add("Pinapple");
		//after removing generics only we get to add heteroenousobject
		fruits.add(new student());
		
		Iterator itr= fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			
//		for(int i=0;i< fruits.size();i++) {
//			System.out.println(fruits.get(i));
			//fruits.remove("mango");
			
			
			
			
		}
	}
	}

