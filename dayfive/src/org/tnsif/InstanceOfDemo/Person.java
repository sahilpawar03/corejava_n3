package org.tnsif.InstanceOfDemo;
//To demonstrate Example of Instance of 
//parent class

public class Person {
	
		//private data members
		private String name;
		private String address;
		
		

		//Getters and Setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		//default constructor
		public Person() {
			super();
			System.out.println("Parent class Person");
		}
		
		
		//Parameterized constructor
		public Person(String name, String address) {
			super();
			this.name = name;
			this.address = address;
		}
		
		
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", address=" + address + "]";
		}
		
		
}
