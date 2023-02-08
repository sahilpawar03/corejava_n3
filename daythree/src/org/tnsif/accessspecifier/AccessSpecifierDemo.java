package org.tnsif.accessspecifier;

public class AccessSpecifierDemo {

	public static void main(String[] args) {
		
		
		AccessSpecifierExample ab = new AccessSpecifierExample();
		
		//ab.name = "Manoj Tiwari";
		
		
		//use getter and setter for private variable
		ab.setName("Manoj");
		System.out.println("Name is : "+ ab.getName());
		
		//ab.display();

	}

}
