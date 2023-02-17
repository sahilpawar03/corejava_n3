package org.tnsif.annotations;
class DeprecatedDemo
{

	@Deprecated

	public void display()
	{
		System.out.println("Deprecated Annotation Demo");
	}
}

public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		DeprecatedDemo d=new DeprecatedDemo();
		d.display();


	}

}
