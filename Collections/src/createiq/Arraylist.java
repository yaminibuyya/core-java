package createiq;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> dairyProducts = new ArrayList<>();
		dairyProducts.add("Milk");
		dairyProducts.add("Curd");
		dairyProducts.add("Ghee");
		dairyProducts.add("Panneer");
		dairyProducts.add("Cheese");

//		Iterator<String> iterator = dairyProducts.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		ArrayList<String> fruits = new ArrayList<>(dairyProducts);
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Pinapple");
		
		System.out.println(fruits);
//		
//		Iterator<String> itr = fruits.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next()); 
//		}

		ArrayList<String> products = new ArrayList<>(dairyProducts);
		products.addAll(fruits);
		System.out.println(products);

//          ArrayList fruits1=new ArrayList(fruits);
//          fruits1.addAll(dairyProducts);
//          System.out.println(fruits1);

}
}
