package org.tnsif.SinglelevelInheritance;

public class Student {

	
	// Private Data members
		private int rollno;
		private String studname;
		
		
		//getters and setters method
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getStudname() {
			return studname;
		}
		public void setStudname(String studname) {
			this.studname = studname;
		}
		
		//default constructor
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//Parameterized constructor
		public Student(String name, long aadharno, String city, long mobno, int rollno, String studname) {
			super();
			this.rollno = rollno;
			this.studname = studname;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", studname=" + studname + ", getName()=" + getName() + ", getAadharno()="
					+ getAadharno() + ", getCity()=" + getCity() + ", getMobno()=" + getMobno() + "]";
		}
		
		
}
