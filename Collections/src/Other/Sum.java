package Other;

import java.util.ArrayList;
import java.util.List;

public class Sum {
		public static void main(String[] args) {
			int sum=0;
			
			List<Integer> list=new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			
			for(Integer i:list) {
				sum=sum+i;
			}
			System.out.println(sum);

	}			


}
