package org.tnsif.DecisionMaking;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the song number");
		int songno=sc.nextInt();

		switch(songno) {
		case 1:
			System.out.println("kesariya");
			break;
		case 2:
			System.out.println("Ved");
			break;
		case 3:
			System.out.println("Calm Dpwm");
			break;
		default:
			System.out.println("Invalid Input");
		}

		//OUTPUT
		/*
		 12
		30
		Not Eligible
		 */
	
	}

}
