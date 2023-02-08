package org.tnsif.superkeyword;
//program to demonstrate the Example of super keyword in terms of variable
	public class Flower {
		//private data members
		private String name;
		
		//getters and setters
		public String getname() {
			return name;
		}

		public void setname(String name) {
			this.name = name;
		}
		
		//default const
		public Flower() {
			super();
			System.out.println("Parent Class");
		}
		
		//parameterized const
		public Flower(String name) {
			super();
			this.name = name;
		}
}
