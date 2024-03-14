package StringbasedPrograms;

public class CountSpaces {
	public static void main(String[] args) {
		String s= " hi hello ";
		String s1=s.trim();
		int count=0;
		for(int i=0;i<=s1.length();i++) {
			if(s.charAt(i)==' ')
			count++;
			
		}
		System.out.println("total :"+count);
	}

}
