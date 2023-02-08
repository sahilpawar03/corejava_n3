package HierarchicalInheritance;

public class Tiramisu extends AndroidVersion{

	private String version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public Tiramisu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiramisu(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", getVersion()=" + getVersion() + ", getType()=" + getType() + "]";
	}
	
	
}
