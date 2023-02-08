package HierarchicalInheritance;

public class Snowcone extends AndroidVersion{

	private int getversion;

	public int getGetversion() {
		return getversion;
	}

	public void setGetversion(int getversion) {
		this.getversion = getversion;
	}
	
	
	
	public SnowCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SnowCone(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SnowCone [getversion=" + getversion + ", getGetversion()=" + getGetversion() + ", getType()="
				+ getType() + "]";
	}
	
}
