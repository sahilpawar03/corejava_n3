package HierarchicalInheritance;

public class AndroidVersion {

private String type;

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AndroidVersion(String type) {
		super();
		this.type = type;
	}
	
	
	
	public AndroidVersion() {
		//super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + ", getType()=" + getType() + "]";
	}
	
}
