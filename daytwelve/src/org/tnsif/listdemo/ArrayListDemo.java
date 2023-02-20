package org.tnsif.listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * Collection is an interface, we can't
		 * create an object for a collection
		 * */
		//Collection obj=new Collection<>();
		//List1
		List <Object> obj=new ArrayList<>();
		obj.add(10);
		obj.add(23.78f);
		obj.add("Sahil");
		obj.add('A');
		obj.add(true);
		System.out.println("1st :"+obj);

		
		//List2
		List<Object> obj1=new ArrayList<>();
		obj1.addAll(obj);
		System.out.println("2nd :"+obj1);
		System.out.println("Size of List1: "+obj.size());
		System.out.println("Is list1 is empty? "+obj.isEmpty());
		obj.remove(0);
		System.out.println("1st :"+obj);
		System.out.println(obj1.contains(10));
		System.out.println("Element at index 1: "+obj.get(1));
		System.out.println("Index of 'A'"+obj1.indexOf('A'));
		obj1.add(23.78);
		System.out.println("2nd :"+obj1);

		System.out.println("Index of 23.78f: "+obj1.indexOf(23.78));
		//obj.clear();
		System.out.println(obj);
		
		//List3
		List<Integer>obj3=new ArrayList<>();
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
