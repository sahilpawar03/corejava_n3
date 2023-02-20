package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		Deque<String> obj=new ArrayDeque<>();
		obj.add("Sahil");
		obj.addFirst("Pratik");
		obj.offerFirst("Sam");
		obj.addLast("Rushi");
		System.out.println("Array Deque elemntns are: ");
		for(String s: obj)
		{
			System.out.print(s+" ");
		}
		obj.removeFirst();
		System.out.println("\n\nRemove first: "+obj);
		obj.removeLast();
		System.out.println("Remove last: "+obj);
		obj.remove();
		System.out.println("Array Deque elemntns are: "+obj);



	}

}
