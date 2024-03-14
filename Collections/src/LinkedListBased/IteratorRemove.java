package LinkedListBased;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorRemove {
	public static void main(String[] args) {
		
	LinkedList num=new LinkedList();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	
	Iterator itr=num.iterator();
	while(itr.hasNext()) {
		int item=(Integer) itr.next();
		if(item%2==0) {
			itr.remove();
		}
	}
	System.out.println(num);

}
}
