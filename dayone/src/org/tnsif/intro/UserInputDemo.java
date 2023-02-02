package org.tnsif.intro;

import java.util.Scanner;


public class UserInputDemo {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter integer value");
			int x=sc.nextInt();
			
			System.out.println("Enter float value");
			float y=sc.nextFloat();
			char ch=sc.next().charAt(0);
			String name =sc.next();
			//String str =sc.nextLine();
			double d=sc.nextDouble();
			sc.close();
			
			System.out.println("the value of x is "+x);
			System.out.println("the value of y is "+y);
			System.out.println("the value of ch is "+ch);
			System.out.println("the value of name is "+name);
			//System.out.println("the value of str is "+str);
			System.out.println("the value of d is "+d);
			
	}

}
