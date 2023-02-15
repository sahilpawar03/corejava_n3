package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		try
		{
			if(id.equals("pawarsahil7699@gmail.com") &&
					password.equals("abc@123"))
			{
				System.out.println("Credentials matched");
			}
			else
				throw new LoginCredential("Invalid credential");
			
			
		}
		catch(LoginCredential e)
		{
			System.out.println("Exception handled "+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}

	}

}
