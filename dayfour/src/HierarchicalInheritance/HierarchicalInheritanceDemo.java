package HierarchicalInheritance;

import java.util.Scanner;

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type and version");
		String type=sc.nextLine();
		sc.nextLine();
		int version=sc.nextInt();
		int version1=sc.nextInt();
		KitKat s1=new KitKat();
		s1.setType(type);
		s1.setVersion(version);
		
		Tiramisu t=new Tiramisu();
		t.setType(type);
		t.setVersion(version1);
		
		System.out.println(s1);
		System.out.println(t);
		
		

	}
}
