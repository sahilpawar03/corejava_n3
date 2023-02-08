package org.tnsif.superkeyword;

//parent class
public class Renault {
	//protected data member can be accessed from child class
	protected String engine = "petrol";
	
	public void print() {
		System.out.println("Engine required :"+ engine);
	}
	

}
