package org.tnsif.genericsdemo;

import java.util.ArrayList;

//program to demonstrate advantages of generics

public class GenericsAdvantageDemo {
	

	public static void main(String[] args) {
		//1. type-safety
				//without generics
				ArrayList obj=new ArrayList();
				obj.add(15);
				obj.add("15");
				System.out.println("Without generics: "+obj);
				
				//without generics
				ArrayList<Integer> obj1=new ArrayList();
				obj1.add(15);
				//obj1.add("15");
				System.out.println("Witho generics: "+obj1);
				
				//2.Type casting
				//typecassting allowed before generics
				ArrayList obj2=new ArrayList();
				obj2.add("MET");
				//typecasting
				String s=(String)obj2.get(0);
				System.out.println(s);
				
				//with generics typecasting is not allowed
				ArrayList<String> obj3=new ArrayList();
				obj3.add("MET");
				//typecasting
				String s1=obj3.get(0);
				System.out.println(obj3);
				
				

	}

}
