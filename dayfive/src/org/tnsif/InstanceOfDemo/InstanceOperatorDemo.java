package org.tnsif.InstanceOfDemo;
import java.util.Scanner;
public class InstanceOperatorDemo {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name, Address, Age:");
		String name = sc.next();
		String add = sc.next();
		int age = sc.nextInt();
		
		Child c1 = new Child();
		Child c2 = new Child(name,add,age);
		System.out.println(c2);
		//using instance of keyword
		System.out.println(c1 instanceof Child);
		System.out.println(c1 instanceof Person);
		//same for c2


	}

}
