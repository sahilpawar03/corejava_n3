package org.tnsif.threadlifecycle;

//program to demonstrate on Thread lifecycle
//driver class

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {

			Tech t=new Tech();
			SoftSkill s=new SoftSkill();
			t.start();
			// Move control to another thread
			t.yield();
			
			s.start();

		}

	}


