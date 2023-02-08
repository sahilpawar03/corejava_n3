package org.tnsif.thiskeyword;

class Maths{
	int a,b;
	
	//default constructor
	// it initializes the class variables
	Maths(){
		a = 7;
		b = 4;
	}
	
	//using this keyword
	Maths accept() {
		return this;
	}
	
	void display() {
		System.out.println("a is "+ a);
		System.out.println("b is "+ b);
	}
}


public class ThisKeywordRunner {

	public static void main(String[] args) {
		
		Maths a1 = new Maths();
		a1.accept().display();
		
	}

}


//Output
//a is 7
//b is 4
