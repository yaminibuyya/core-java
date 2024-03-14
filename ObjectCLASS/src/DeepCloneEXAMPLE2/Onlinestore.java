package DeepCloneEXAMPLE2;

public class Onlinestore implements Cloneable {
	private String name;
	private  int NoOfSections;
	private  double budget;
	private GirlsSection GS;
	private BoysSection BS;
	
	
	public Onlinestore(String name,int NoOfSections,double budget,GirlsSection GS,BoysSection BS) {
		this.name=name;
		this.NoOfSections=NoOfSections;
		this.budget=budget;	
		this.GS=GS;
		this.BS= BS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getNoOfSections() {
		return NoOfSections;
	}
	public void setNoOfSections(int NoOfSections) {
		this.NoOfSections=NoOfSections;
	}
	public double getbudget() {
		return budget;
	}
	public void setbudget(double budget) {
		this.budget=budget;
	}
	public GirlsSection getGirlsSection(){
		return GS;
	}
	public void setGirlsSection(GirlsSection GS) {
		this.GS= GS;
	}
	public BoysSection getBoysSection() {
		return BS;
	}
	public void setBoysSection(BoysSection BS) {
		this.BS=BS;
	}
	
	@Override
	public String toString() {
		return "Onlinestore [name=" + name + ", NoOfSections=" + NoOfSections + ", budget=" + budget + ", getName()="
				+ getName() + ", getNoOfSections()=" + getNoOfSections() + ", getbudget()=" + getbudget() + ",getGirlsSection()=" +getGirlsSection()+ ",getBoysSection()" +getBoysSection()+ "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Onlinestore cloned=(Onlinestore )super.clone();//from oblect class it was cloning
		cloned.setGirlsSection((GirlsSection)cloned.getGirlsSection().clone());
		cloned.setBoysSection((BoysSection)cloned.getBoysSection().clone());
		return cloned;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
