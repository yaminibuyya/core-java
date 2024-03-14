package demoproject;

//write operation not allowed
	public class MyDemoBound {

		private static void BottleInfo(Bottle<? extends OralMedicine> bottle)
		{
			System.out.println("bottle type:"+bottle.getItem().getClass().getName());
		}
		
		//read operation
		private static void getOralmedicine(Bottle<? extends OralMedicine> bottle)
		{
			OralMedicine oral=bottle.getItem();
			//System.out.println(oral);
			
			//Tablet t=(Tablet) bottle.getItem(); //not allow
		}
		
		public static void main(String[] args) {
			BottleInfo(new Bottle<Tablet>(new Tablet()));
			
			BottleInfo(new Bottle<Capsule>(new Capsule()));
			
			getOralmedicine(new Bottle<Tablet>(new Tablet()));
			
			getOralmedicine(new Bottle<Capsule>(new Capsule()));
			
			//its not allow bz we give a limits i.e extends Oralmedicine classes only allow
			//BottleInfo(new Bottle<Injection>(new Injection()));

		
		}

	}


