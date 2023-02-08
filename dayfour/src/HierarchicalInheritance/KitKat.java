package HierarchicalInheritance;

public class KitKat extends AndroidVersion {
	//data member
	private int version;

	//getter setter
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	//constructors
	public KitKat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KitKat(int version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "KitKat [version=" + version + "]";
	}
	
}
