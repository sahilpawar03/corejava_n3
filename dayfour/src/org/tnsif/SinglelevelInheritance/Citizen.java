package org.tnsif.SinglelevelInheritance;

public class Citizen {

	//Private Data members
		private String name;
		private long aadharno;
		private String city;
		private long mobno;
		
		
		//getters and setters
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public long getAadharno() {
			return aadharno;
		}


		public void setAadharno(long aadharno) {
			this.aadharno = aadharno;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public long getMobno() {
			return mobno;
		}


		public void setMobno(long mobno) {
			this.mobno = mobno;
		}
		
		
		// Default constructor
			public Citizen() {
				System.out.println("Default Constructor of Citizen");
			}
		
		// Parameterized constructor
		public Citizen(String name, long aadharno, String city, long mobno) {
			super();
			this.name = name;
			this.aadharno = aadharno;
			this.city = city;
			this.mobno = mobno;
		}


		@Override
		public String toString() {
			return "Citizen [name=" + name + ", aadharno=" + aadharno + ", city=" + city + ", mobno=" + mobno + "]";
		}
		
		
		
}
