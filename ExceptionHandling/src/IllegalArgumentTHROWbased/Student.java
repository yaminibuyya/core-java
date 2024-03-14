package IllegalArgumentTHROWbased;

public class Student {
	private int id;
	private String name;
	
	public Student(int id,String name) {
		if(id!=0 && name!=null) {
			this.id=id;
			this.name=name;
			
		}
		else {
			throw new IllegalArgumentException("name and id should not be null");
		}
		
		
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
	System.out.println("Id of student:"+id);
	System.out.println("NAME of student:"+name);
	}
    public static void main(String[] args) {
    	Student s1=new Student(4,"sahasra");
    	//Student s=new Student(0,null);
    	s1.display();
    	//s.display();
    }


	

	


	}

