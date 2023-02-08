package org.tnsif.thiskeyword;

class HR{
	//pass HR with argument when used 'this' in the method i.e func2
	void func1(HR h1) {
		System.out.println("Func1 is invoked !");
	}
	//using 'this' keyword
	void func2() {
		func1(this);
	}
}

public class ThisKEywordExecuter {

	public static void main(String[] args) {
		
		HR m = new HR();
		m.func2();

	}

}
