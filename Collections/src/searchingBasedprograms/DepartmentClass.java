package searchingBasedprograms;


	public class DepartmentClass {
		private int depId;
		private String depName;
		
		public DepartmentClass(int depId, String depName) {
			super();
			this.depId = depId;
			this.depName = depName;
		}

		public int getDepId() {
			return depId;
		}

		public void setDepId(int depId) {
			this.depId = depId;
		}

		public String getDepName() {
			return depName;
		}

		public void setDepName(String depName) {
			this.depName = depName;
		}

		@Override
		public String toString() {
			return "DepartmentClass [depId=" + depId + ", depName=" + depName + "]";
		}
		
		
		

	}

