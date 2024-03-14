package normaLInnerClass;

public class OuterClass {
	 static int x=5;

	 class InnerClass{
		  int y=20;
		//int c=(x+y);
	}
	
	 
		public static void main (String[] args) {
			OuterClass myout=new OuterClass();
			OuterClass.InnerClass myin=myout.new InnerClass();
			System.out.println(myout.x);
			System.out.println(myin.y);
			System.out.println(myout.x+myin.y);
		//	System.out.println(myin.c);
			
		}
	}

