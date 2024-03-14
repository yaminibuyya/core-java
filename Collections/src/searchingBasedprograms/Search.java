package searchingBasedprograms;

import java.util.ArrayList;
import java.util.List;

public class Search {
		public static void main(String[] args) {
			
			List<String> list=new ArrayList<>();
			
			list.add("java");
			list.add("python");
			list.add("c");
//			list.add("c++");
			
			for(String str:list) {
				if(str.contains("pi8")) {
					System.out.println(str);
				}//else {
					//System.out.println("The given element is absent");
				//}
			}
			
			
			
		}
}
