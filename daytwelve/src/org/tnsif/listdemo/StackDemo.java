package org.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> obj=new Stack<>();
		obj.push("Sahil");
		obj.push("P");
		obj.push("S");
		obj.push("Pratik");
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);

	}

}
