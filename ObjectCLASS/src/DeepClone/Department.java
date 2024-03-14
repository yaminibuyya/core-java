package DeepClone;

public class Department implements Cloneable{
	private String name;
	private String Zone;
	private int block;

	public Department() {
	}
	public Department(String name,String zone,int block) {
		this.name=name;
		this.Zone=zone;
		this.block=block;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZone() {
		return Zone;
	}

	public void setZone(String zone) {
		Zone = zone;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}


	
	@Override
	public String toString() {
		return "Department [name=" + name + ", Zone=" + Zone + ", block=" + block + ", getName()=" + getName()
				+ ", getZone()=" + getZone() + ", getBlock()=" + getBlock() + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
	
}
