package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> obj=new PriorityQueue<>();
		//add and offer method is used to insert an element
		obj.add(34);
		obj.add(55);
		obj.add(91);
		obj.add(15);
		obj.offer(77);
		System.out.println("Queue elements are: "+obj);
		/*obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();*/
		
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		obj.remove();
		System.out.println("Queue elements are: "+obj);
		//first element in queue
		System.out.println("Head element is: "+obj.peek());
		System.out.println("Head element is: "+obj.element());

	}

}
