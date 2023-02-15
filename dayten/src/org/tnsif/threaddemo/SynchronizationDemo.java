package org.tnsif.threaddemo;
//program to demonstrate synchronized method
public class SynchronizationDemo {

	//using synchronized keyword to print method
		synchronized void print(int num) throws InterruptedException {
			for (int i=1; i<=5; i++) {
				System.out.println(num*i);
			}
		}

	}

	class ThreadOne extends Thread{
		SynchronizationDemo d;

		public ThreadOne(SynchronizationDemo d) {
			super();
			this.d = d;
		}
		
		public void run() {
			try {
				d.print(15);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	class ThreadTwo extends Thread{
		SynchronizationDemo d;

		public ThreadTwo(SynchronizationDemo d) {
			super();
			this.d = d;
		}
		
		public void run() {
			try {
				d.print(15);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}


