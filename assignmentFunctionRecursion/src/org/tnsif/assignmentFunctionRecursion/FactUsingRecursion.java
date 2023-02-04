package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;
// to demonstrate fact an example of a number using recursion 
public class FactUsingRecursion {
	
	//function definition 
		static int factorial (int num)
		{
			if(num!=0);
			return num*factorial (num-1);
			
		}
		
	public static void main(String[] args) {
		

		Scanner s=new Scanner (System.in);
		System.out.println("Ener the number:");
		int num= s.nextInt();
		
		//function call
		System.out.println("Factorial of a given number is"+factorial(num));
		s.close();
	}

}
