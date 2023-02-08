package org.tnsif.accessspecifierr;

public class AccessSpecifierDemo {

	public static void main(String[] args) {
	
		AccessSpecifierExample ab = new AccessSpecifierExample();

		ab.name = "Sahil Pawar";
		
		
				//use getter and setter for private variable
		
				 ab.setName("Sahil");
				
				System.out.println("Name is : "+ ab.getName());
				
				ab.display();

	}

}
