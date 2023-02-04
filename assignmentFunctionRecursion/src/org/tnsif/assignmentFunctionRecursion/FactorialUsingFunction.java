package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

// to demonstrate factorial an example of a number using function 
public class FactorialUsingFunction {
	
	//function definition 
	static int factorial (int num)
	{
		int fact =1;
		for(int i=1;i<=num;i++)
		{
			fact=i*fact;
		}
		return fact;
	}
	
	// main function
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Ener the number:");
		int num= s.nextInt();
		
		//function call
		System.out.println("Factorial of a given number is"+factorial(num));
		s.close();
	}

}
