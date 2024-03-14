package sortinggbasedProblems;

public class CustomSorting {

		private int id;
		private String name;
		private String dresscolor;
		
		public CustomSorting(){
		}
		
		public CustomSorting(int id, String name, String dresscolor) {
			super();
			this.id = id;
			this.name = name;
			this.dresscolor = dresscolor;
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
		public String getDresscolor() {
			return dresscolor;
		}
		public void setDresscolor(String dresscolor) {
			this.dresscolor = dresscolor;
		}
		@Override
		public String toString() {
			return "CustomSorting [id=" + id + ", name=" + name + ", dresscolor=" + dresscolor + "]";
		}
		
		

	}


