package org.tnsif.threadlifecycle;

//program to demonstrate on Thread lifecycle

public class SoftSkill extends Thread{
	
	public void run()
	{
		System.out.println("Professional Ethics");
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("Soft-skill session");

	}


}



