package demo;

public class TwoDarray {

	public static void main(String[] args) {
		int [][]a,b;
		a=new int[2][2];
		b=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		b[0][0]=50;
		b[0][1]=51;
		b[1][0]=52;
		b[1][1]=53;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
//		for (int  is[] : b) {
//			for(int i: is) {
//				System.out.println(i);
//			}
//		}
	}
}
	
