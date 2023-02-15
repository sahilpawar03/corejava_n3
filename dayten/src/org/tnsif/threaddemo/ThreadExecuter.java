package org.tnsif.threaddemo;

public class ThreadExecuter {

	public static void main(String[] args) {
		SimpleThreadProgram a = new SimpleThreadProgram();
		//sets name for the thread
		a.setName("java thread");
		
		//sets priority for the thread
		a.setPriority(8);
		
		//starting the thread
		a.start();
		//once we call start method we can't call start method again
		//when a calls start method it will come to run method
		System.out.println("Current thread: "+ a);
	}



}
