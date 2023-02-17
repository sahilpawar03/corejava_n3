package org.tnsif.usingrunnable;
//driver class
//program to demonstrate on Runnable interface for a thread

public class MarathonExecutor {

	public static void main(String[] args) {
		
		Marathon m=new Marathon();
		m.setSpeed(40);
		m.setCity("Pune");
		m.run();

	

	}

}
