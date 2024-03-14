package sortinggbasedProblems;

import java.util.ArrayList;
import java.util.Collections;

public class sortingDemo {
	public static void main(String[] args) {
		ArrayList<String> capitals=new ArrayList<String>();
		capitals.add("Tokyo");
		capitals.add("Moscow");
		capitals.add("Seoul");
		capitals.add("Beijing");
		capitals.add("Newdelhi");//here case sensitivity is present that if we type lowercase letters
//it was not showing in correct order bcz on the bases of ASCII values we are getting the order		
		Collections.sort(capitals);
		//System.out.println(capitals);
		for(String c:capitals) {
			System.out.println(c);
		}
		
		
		
	}

}
