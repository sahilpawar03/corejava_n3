package org.tnsif.thiskeyword;

class Account {
	//class variable
	int a;
	int b;
	//using this keyword
	public void setdata(int a, int b) {
		//method variable
		this.a = a; 
		this.b = b;
	}
	
	public void showdata() {
		System.out.println("Value of a is: " + a);
		System.out.println("Value of b is: " + b);
	}
	
}
public class ThisKeywordDemo {

	public static void main(String[] args) {
		
		Account obj = new Account();
		obj.setdata(4, 5);
		obj.showdata();

	}
}
