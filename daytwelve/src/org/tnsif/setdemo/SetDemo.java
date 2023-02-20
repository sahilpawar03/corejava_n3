package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//program to demonstrate on difference between Hashset and linkedhashset

public class SetDemo {

	public static void main(String[] args) {
		//HashSet will print the elements in unordered wise
				Set<Object> obj1=new HashSet<>();
				obj1.add(11);
				obj1.add("Naina");
				obj1.add(345.89f);
				obj1.add(true);
				System.out.println("Set1 elements are: "+obj1);
				
				//LinkedHashSet will print the elements in ordered wise
				Set<Object> obj2=new LinkedHashSet<>();
				obj2.add(11);
				obj2.add("Naina");
				obj2.add(345.89f);
				obj2.add(true);
				obj2.add(true);//set not allowed duplicate element
				System.out.println("Set2 elements are: "+obj2);
				
				
				System.out.println("Obj1==obj2 "+obj1.equals(obj2));
				

	}

}
