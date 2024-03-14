package demoproject;
	

	public class Bottle <T>{
		private T item;

		public Bottle(T item) {
			super();
			this.item = item;
		}

		public T getItem() {
			
			return item;
		}

		public void setItem(T item) {
			this.item = item;
		}

//		@Override
//		public String toString() {
//			return "Bottle [item=" + item + "]";
//		}
		
		
		

	}


