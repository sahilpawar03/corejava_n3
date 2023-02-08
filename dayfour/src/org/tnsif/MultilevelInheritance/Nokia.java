package org.tnsif.MultilevelInheritance;

//Multilevel Inheritance Example

public class Nokia {

	private int modelno;
	public void display() {
		System.out.println("Model is "+ modelno);
	}
	
	
	//getters and setters
	public int getModelno() {
		return modelno;
	}


	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
	//default constructor
	public Nokia() {
		System.out.println("Nokia default Constructor");
	}
	
	//Parameterized constructor
	public Nokia(int modelno) {
		//super();
		this.modelno = modelno;
	}
	
}
