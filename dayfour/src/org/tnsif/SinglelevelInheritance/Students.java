package org.tnsif.SinglelevelInheritance;

public class Students extends Citizen {
	
	//private data members
    private int rollno;
    private String studname;
    
    //getter setter methods
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
	
	//constructor
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Students(String adharno, String name, String city, long mbno, int rollno, String studname) {
		super(adharno, name, city, mbno);
		this.rollno = rollno;
		this.studname = studname;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", studname=" + studname + ", getAdharno()=" + getAdharno()
				+ ", getName()=" + getName() + ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + "]";
	}
	
	
	
	
	
		
}
