package LinkedListBased;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {

	public static void main(String[] args) {
    LinkedList<String> names=new LinkedList<String>();
//    names.add("sahasra");
//    names.add("yamini");
//    names.add("vinay");
//    names.add("afreen");
//    names.add("pooji"); 
    
//    Iterator<String> itr=names.iterator();
//    while(itr.hasNext()) {
//    	String item=(String)itr.next();
//    	if(item=="yamini") {
//    		itr.remove();
//    	}
//    }
//    System.out.println(names);
//    
//
//	}
    
	Iterator itr=names.iterator();
	//System.out.println(itr.hasNext());
	System.out.println(itr.next());

}
}
