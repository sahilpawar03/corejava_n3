package org.tnsif.SinglelevelInheritance;

//to demonstrate on single level inheritance
public class Citizen {
	//private data members
	private String adharno;
	private String name;
	private String city;
	private long mbno;
	
	//paramterize constructor
	public Citizen(String adharno, String name, String city, long mbno) {
		super();
		this.adharno = adharno;
		this.name = name;
		this.city = city;
		this.mbno = mbno;
	}
	
	//default constructor
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter setter methods
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Citizen [adharno=" + adharno + ", name=" + name + ", city=" + city + ", mbno=" + mbno + "]";
	}
	
	
	
		
}
