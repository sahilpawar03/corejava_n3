package HierarchicalInheritance;

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		SnowCone s1 = new SnowCone();
		s1.setGetversion(12);
		s1.setType("Realme");
		System.out.println(s1);
		
		SnowCone s2 = new SnowCone("Realme7");
		System.out.println(s2);

	}

}
