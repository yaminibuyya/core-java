package StringbasedPrograms;


	public class DuplicateWORDSINSentence {
	    
	    public static void main(String[] args) {
	    
	    String a= ("1234 funnystreet bigcity ny 90212");
	    String[] b = a.split(" ");
	//    System.out.println(b.length);
	    
	    for (int i=0;i<b.length;i++) {
	        //for(int j=0;j<b.length;j++) {
	            
//	            if(i!=j) {
//	                
//	                if(b[i].equals(b[j])) {
	                    System.out.println(b[i]);
//	                    b[i]="0";//to avoid repeatation of words after comparing two values it will be replaced with some default values thus the repeating of same words will be avoided
//	                    b[j]="";    
	              //  }
	           // }
	        }
	    }
	    
}
	