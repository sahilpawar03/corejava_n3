package org.tnsif.EncapsulationDemoo;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		HDFC b = new HDFC();
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		b.setPin(p);
		
		sc.close();
		//b.setPin(4545); //setter method
		
		System.out.println("pin is : " + b.getPin()); //getter method
		b.accept(); // accept method

	}

}
