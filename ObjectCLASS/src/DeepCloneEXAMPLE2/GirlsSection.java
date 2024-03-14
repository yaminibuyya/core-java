package DeepCloneEXAMPLE2;

public class GirlsSection implements Cloneable {
	private int NoOfBrands;
	private int NoOfWesternwear;
	private int NoOfEthicwear;
	
	public GirlsSection(int NoOfBrands,int NoOfWesternwear,int NoOfEthicwear) {
		this.NoOfBrands=NoOfBrands;
		this.NoOfWesternwear=NoOfWesternwear;
		this.NoOfEthicwear=NoOfEthicwear;
	}
	public int getNoOfBrands() {
		return NoOfBrands;
	}
	public void setNoOfBrands(int noOfBrands) {
		NoOfBrands = noOfBrands;
	}
	public int getNoOfWesternwear() {
		return NoOfWesternwear;
	}
	public void setNoOfWesternwear(int noOfWesternwear) {
		NoOfWesternwear = noOfWesternwear;
	}
	public int getNoOfEthicwear() {
		return NoOfEthicwear;
	}
	public void setNoOfEthicwear(int noOfEthicwear) {
		NoOfEthicwear = noOfEthicwear;
	}
	@Override
	public String toString() {
		return "GirlsSection [NoOfBrands=" + NoOfBrands + ", NoOfWesternwear=" + NoOfWesternwear + ", NoOfEthicwear="
				+ NoOfEthicwear + ", getNoOfBrands()=" + getNoOfBrands() + ", getNoOfWesternwear()="
				+ getNoOfWesternwear() + ", getNoOfEthicwear()=" + getNoOfEthicwear() + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
