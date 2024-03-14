package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.offer("sravani");
		pq.offer("yamini");
		pq.offer("sahasra");
		pq.offer("anudeep");
		pq.offer("vamsi");
		//pq.offer(23);
		System.out.println(pq);
		Iterator itr=pq.iterator();
		//transversing elements
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*****************");
		//transversing elements
		for(String values:pq) {
			System.out.println(values);
		}
		
		
	}

}
