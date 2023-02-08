package org.tnsif.thiskeyword;

class Finance{
	int salary;
	
	public Finance() {
		System.out.println("default constructor");
	}

	public Finance(int salary) {
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("Salary is " + salary);
	}
	
	
}


public class ThisKeywordExmplConstructor {

	public static void main(String[] args) {
		Finance f = new Finance(7000);
		f.print();

	}

}
