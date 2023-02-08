package org.tnsif.classandobject;
import java.util.Scanner;
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//while(n<=2) {
		
		
		System.out.println("Enter Customer id");
		int c_id = sc.nextInt();
		
		System.out.println("Enter Customer name:");
		String c_name = sc.next();
		
		System.out.println("Enter Customer city");
		String c_city = sc.next();
		
		//creating object
		Customer c1 = new Customer();
		c1.setId(c_id);
		c1.setCustomer(c_name);
		c1.setCity(c_city);
		//c1.display();
		
		//using getter method for printing data
		System.out.println(c1.getId());
		System.out.println(c1.getCustomer());
		System.out.println(c1.getCity());
		//n++; }

	
		}

}
