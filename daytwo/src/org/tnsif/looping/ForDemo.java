package org.tnsif.looping;
import java.util.Scanner;
public class ForDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("print number from 1 to N");
		// to print 1 to N numbers
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//to print N to 1
		System.out.println("print number from N to 1");
		for(int i=n;i>0;i--) {
			System.out.print(i+" ");
		}

	}

}
