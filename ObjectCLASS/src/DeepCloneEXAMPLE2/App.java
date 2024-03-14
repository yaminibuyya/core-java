package DeepCloneEXAMPLE2;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		GirlsSection gs=new GirlsSection(1, 2, 3);
		BoysSection bs=new BoysSection(4, 5, 6);
		Onlinestore os=new Onlinestore("Miran", 6, 900000.00, gs, bs);
		System.out.println("original data: "+os);
		Onlinestore cloned=(Onlinestore)(os.clone());
		System.out.println("cloning data: "+cloned);
		os.setName("Reether");
		os.getGirlsSection().setNoOfEthicwear(789876);
		os.getBoysSection().setNoOfFootwear(34545);
		System.out.println("original Updated: "+os);
		System.out.println("cloned update: "+cloned);
	}

}
