package pdfbasedprogram;

public class Document {
	private int empid;
	private String designationName;
	private int experience;
	
	public Document() {}
	public Document(int empid,String designationName,int experience) {
		this.empid=empid;
		this.designationName=designationName;
		this.experience=experience;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDesignationName() {
		return designationName;
	}
	
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Document [empid=" + empid + ", designationName=" + designationName + ", experience=" + experience
				+ ", getEmpid()=" + getEmpid() + ", getDesignationName()=" + getDesignationName() + ", getExperience()="
				+ getExperience() + "]";

}
}
