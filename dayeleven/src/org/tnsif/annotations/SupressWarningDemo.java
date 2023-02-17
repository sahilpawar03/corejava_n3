package org.tnsif.annotations;
import java.util.Scanner;
public class SupressWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		// use to remove warnings
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(x);
		

	}

}
