package HierarchicalInheritance;

public class AndroidVersion {
	//data members
	private String type;

	//getter setter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//constructors
	public AndroidVersion() {
		System.out.println("Parent class-Android version");
	}

	public AndroidVersion(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + "]";
	}
	
}
