package org.tnsif.superkeyword;


	public class Duster extends Renault{
		
		private int speed = 160;
		
		public void print() {
			
			super.print();
			System.out.println("Speed is : "  + speed + "km/hr");
		}
}
