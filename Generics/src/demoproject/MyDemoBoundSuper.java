package demoproject;



class Medicine{
	
	//lower bound
}
	class HumanMedicine extends Medicine{
		
	}

	public class MyDemoBoundSuper {
		public static void getoralMedicininfo(Bottle<? super OralMedicine> bottle)
		{
			System.out.println("medicineinfo:"+bottle.getItem().getClass().getName());
		}
		
		//write operation
		private static void addItemTobottle(Bottle<? super OralMedicine> bottle)
		{
			
			//bottle.setItem(new HumanMedicine());//not allowed bz of confusion
		    bottle.setItem(new Tablet());//accept
		    //bz oralmedicine is lowest boundary and its attached to the subtypes
		    //sub type of the instance assign the super class,java allows
		}

		//lowerbound in write operation is possible if setItem(in subclasses of oralclass medicine or same that class object)
		
		//lower bound in read operation not allowed
//		private static void readGetItem(Bottle<? super OralMedicine> bottle)
//		{
//			OralMedicine om=bottle.getItem();
		//subtype reference =super reference is wrong
//		}
		public static void main(String[] args) {
			getoralMedicininfo(new Bottle<Medicine>(new  Medicine()));
			
			getoralMedicininfo(new Bottle<HumanMedicine>(new HumanMedicine()));
			
			//getoralMedicininfo(new Bottle<Injection>(new Injection()));//not allowed

		    // getoralMedicininfo(new Bottle<Tablet>(new Tablet()));//not allowed bz its naot oralmedicine parent
		
		}
	}
	
