package org.tnsif.thiskeyword;

class Main {
	int num;
	
	Main(){
	}
	
	Main(int num){
		//without this keyword it will print 0
		this.num = num;
	}
}


public class ThisKeywordExample {

	public static void main(String[] args) {
		
		Main p = new Main(7);
		System.out.println("Num value is: "+ p.num);

	}

}
