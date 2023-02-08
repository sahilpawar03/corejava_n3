package org.tnsif.ClassAndObjectt;

import java.util.Scanner;

public class CarDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Car c1 = new Car();
		System.out.println("Enter speed of car: ");
		int speed = sc.nextInt();
		c1.display(speed);

	}


}


