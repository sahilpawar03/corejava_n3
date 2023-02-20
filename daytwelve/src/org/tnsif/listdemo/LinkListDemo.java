package org.tnsif.listdemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		List<Object> obj1=new LinkedList<>();
		obj1.add(10);
		obj1.add(23.78f);
		obj1.add("SAHIL");
		obj1.add('A');
		obj1.add(true);
		System.out.println("1st :"+obj1);
		
		System.out.println("Size of List1: "+obj1.size());
		System.out.println("Is list1 is empty? "+obj1.isEmpty());
		obj1.remove(0);
		System.out.println("1st :"+obj1);
		System.out.println(obj1.contains(10));
		System.out.println("Element at index 1: "+obj1.get(1));
		System.out.println("Index of 'A'"+obj1.indexOf('A'));
		obj1.add(23.78);
		System.out.println("2nd :"+obj1);

		System.out.println("Index of 23.78f: "+obj1.indexOf(23.78));
		
		//List3
		LinkedList<Integer>obj3=new LinkedList<>();
		obj3.add(10);
		obj3.add(98);
		obj3.add(56);
		obj3.add(43);
		System.out.println(obj3);
		Collections.sort(obj3);
		System.out.println(obj3);
		Collections.reverse(obj3);
		System.out.println(obj3);

	}

}
