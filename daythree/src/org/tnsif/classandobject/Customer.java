package org.tnsif.classandobject;

public class Customer {
	
	private int id;
	private String customer;
	private String city;
	
	
	//default constructor

//	public Customer() {
//		super();
//		
//	}
	
	//parameterized constructor
//	public Customer(int id, String customer, String city) {
//		super();
//		this.id = id;
//		this.customer = customer;
//		this.city = city;
//	}
	
	//display method is used to display the data of the object
//	void display() {
//		System.out.println(id +" "+ customer +" "+ city);
//	}
	
	//getter and setter methods
	
	//getter is used to print/return values 
	
	//setter is used to set the values
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
