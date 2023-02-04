package org.tnsif.looping;

import java.util.Scanner;
public class WhileDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=n;
		while(i>0)
		{
			System.out.print(i+" ");
			i--;
		}
			
	}

}
//Output
/*
10
1 2 3 4 5 6 7 8 9 10 
10 9 8 7 6 5 4 3 2 1 
*/

	

