 package StringbasedPrograms;

public class DuplicateCharactersINWord { 

	public static void main(String[] args) {
		String s="hellooo";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++; 
					ch[j]='0';
				}
			}
			if(count>1&&ch[i]!='0') {
				System.out.println(String.valueOf(ch[i]).toUpperCase()+" = "+count);
			}

	}

}
}
