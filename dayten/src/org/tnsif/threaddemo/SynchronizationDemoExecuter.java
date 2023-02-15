package org.tnsif.threaddemo;

public class SynchronizationDemoExecuter {

	public static void main(String[] args) {
		SynchronizationDemo o = new SynchronizationDemo();
		ThreadOne t1 = new ThreadOne(o);
		ThreadTwo t2 = new ThreadTwo(o);
		t1.start();
		t2.start();
		
	}
}


