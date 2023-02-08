package org.tnsif.MultilevelInheritance;

//to demonstrate the example on multilevel inheritance
public class Nokia {
	//data members
	private int modelno;
	public void display()
	{
		System.out.println("The model no is : "+modelno);
	}
	
	//constructor
	public Nokia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}
	
  //getter setter methods
	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
	
	
}
