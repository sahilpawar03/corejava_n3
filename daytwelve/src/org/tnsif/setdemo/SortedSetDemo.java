package org.tnsif.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer>obj=new TreeSet<>();
		obj.add(45);
		obj.add(8);
		obj.add(99);
		System.out.println("TreeSet elements: "+obj);
		
	}

}
