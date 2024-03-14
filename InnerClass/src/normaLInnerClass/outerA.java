package normaLInnerClass;

		public class outerA{
			int num=5;
			String value="yamini";
			static  String no="rasi";
			class innerA{
				void fly() {
					System.out.println("i can fly");
				}
			}
			public static void main(String[] args) {
				//we can access static members with out using an object
				System.out.println(outerA.no);
				
				outerA oa=new outerA();
				outerA.innerA toi=oa.new innerA();
				toi.fly();
				System.out.println(oa.num);
					
			}
		}
	