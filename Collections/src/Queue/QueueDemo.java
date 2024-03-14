package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue q1=new LinkedList();
		q1.add(1);
		q1.offer("rani");
		q1.offer("yasmin");
		q1.offer(7999);
		q1.remove();
		System.out.println(q1);//FIFO
		q1.poll();//advanced method of pop
		System.out.println(q1);
		
		System.out.println(q1.element());//it is like peek method
		System.out.println(q1.peek());
		
		
	
	}

}
