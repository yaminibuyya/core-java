package sortinggbasedProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class CustomSortingTest {

	public static void main(String[] args) {
		CustomSorting cs=new CustomSorting(2, "sravani", "skyblue");
		CustomSorting cs1=new CustomSorting(3, "yamini", "red");
		CustomSorting cs2=new CustomSorting(4, "rani","yellow");
		CustomSorting cs3=new CustomSorting(5, "manu", "black");
		
		ArrayList<CustomSorting> al=new ArrayList<CustomSorting>();
		al.add(cs);
		al.add(cs1);
		al.add(cs2);
		al.add(cs3);
		//System.out.println(al);
		
		Collections.sort(al,new Comparator<CustomSorting>() {

			@Override
			public int compare(CustomSorting o1, CustomSorting o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		//System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}
}

