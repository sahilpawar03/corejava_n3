package org.tnsif.superkeyword;

public class Rose extends Flower {
	
	private String name;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Rose() {
		super();
		System.out.println("This is Rose Class");
	}

	public Rose(String name) {
		super();
		this.name = name;
	}
	
	public void display() {
		System.out.println(name);
		super.setname("Flower");
		System.out.println(super.getname());
	}
	
	
	

}
