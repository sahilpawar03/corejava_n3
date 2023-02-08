package org.tnsif.accessspecifier;

public class AccessSpecifierExample {
	
	//data members
	public String name; 
	
	
	// public can be accessed from any class and package
	//private - only in same class
	//void display()  -- default can be accessed only in same package
	
	
	public void display() {
		System.out.println("name is " + name);
	}

	
	//getters and setters for private data member to access from another class
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
