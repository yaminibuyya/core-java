package demoproject;



public class MyDemo {
		
		private static void BottleInfo(Bottle<?> bottle)
		{
			System.out.println("bottle type:"+bottle.getItem().getClass().getName());
		}

		public static void main(String[] args) {
			//it throws Type mismatch: cannot convert from Bottle<Tablet> to Bottle<OralMedicine>
			//Bottle<OralMedicine> tabletbot=new Bottle<Tablet>(new Tablet());
			//Bottle<OralMedicine> capsulebot =new Bottle<Capsule>(new Capsule());
			
			
			//but wild card generic accept ,its parameter is anything
			Bottle<?> tabletbot =new Bottle<Tablet>(new Tablet());
			BottleInfo(new Bottle<Tablet>(new Tablet()));
			
			Bottle<?> capsulebot =new Bottle<Capsule>(new Capsule());
			BottleInfo(new Bottle<Capsule>(new Capsule()));
			
			//independent class is Injection
			//but it accepted bz of<?> take anything type
			Bottle<?> injbot=new Bottle<Injection>(new Injection());
			BottleInfo(new Bottle<Injection>(new Injection()));
			//but its disadvantage overcome this we use boundary

		}

	}


