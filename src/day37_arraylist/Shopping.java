package day37_arraylist;
import java.util.*;
public class Shopping {

	public static void main(String[] args) {

		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel"); // lopata
		
		//print number of items
		int count = shoppingList.size();
		System.out.println("Total count: " + count); // 6
		//print all items in single line
		System.out.println(shoppingList.toString()); //[paper towel, dish soap, trash bag, clorox, gloves, shovel]
		//print first and last item    
		// for arraylist we need GET (to red arrayList)
		System.out.println(shoppingList.get(0) + " | " + shoppingList.get(count-1));
		//remove
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));//dish soap
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		// print every item in different lines
		for (String item : shoppingList) {
			System.out.println(item);
		}
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString()); // []
		
	}
	

}
