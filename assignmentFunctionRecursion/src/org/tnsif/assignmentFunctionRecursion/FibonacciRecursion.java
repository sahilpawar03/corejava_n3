package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

public class FibonacciRecursion {

	public static int fibonacci_rec(int n) {
		if (n == 0){
			return 0;
		}
		
		if (n==1 || n==2) {
			return 1;
		}
		return fibonacci_rec(n-2) + fibonacci_rec(n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		for (int  i=0; i<num; i++) {
			System.out.println(fibonacci_rec(i));
		}
				
		

	}

}
