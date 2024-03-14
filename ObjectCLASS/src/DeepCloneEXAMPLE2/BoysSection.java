package DeepCloneEXAMPLE2;

public class BoysSection implements Cloneable {
	private int NoOfTopwear;
	private int NoOfBottomwear;
	private int NoOfFootwear;
	
	public BoysSection(int NoOfTopwear,int NoOfBottomwear,int NoOfFootwear) {
		this.NoOfTopwear=NoOfTopwear;
		this.NoOfBottomwear=NoOfBottomwear;
		this.NoOfFootwear=NoOfFootwear;
	}
	public int getNoOfTopwear() {
		return NoOfTopwear;
	}
	public void setNoOfTopwear(int noOfTopwear) {
		NoOfTopwear = noOfTopwear;
	}
	public int getNoOfBottomwear() {
		return NoOfBottomwear;
	}
	public void setNoOfBottomwear(int noOfBottomwear) {
		NoOfBottomwear = noOfBottomwear;
	}
	public int getNoOfFootwear() {
		return NoOfFootwear;
	}
	public void setNoOfFootwear(int noOfFootwear) {
		NoOfFootwear = noOfFootwear;
	}
	@Override
	public String toString() {
		return "BoysSection [NoOfTopwear=" + NoOfTopwear + ", NoOfBottomwear=" + NoOfBottomwear + ", NoOfFootwear="
				+ NoOfFootwear + ", getNoOfTopwear()=" + getNoOfTopwear() + ", getNoOfBottomwear()="
				+ getNoOfBottomwear() + ", getNoOfFootwear()=" + getNoOfFootwear() + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
