package day32_methods04;


public class Cooking {
	public static void main (String[] args) {
		makePancakes();
		makePasta();
		makePancakes();
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~" + dish.toUpperCase()+ " IS READY!~~");
	//	if(dish.contentEquals("pancakes")) {
		//	makePancakes();
	//	}
	}
	
	
	public static void makePasta() {
		System.out.println("     ~~ITALIAN PASTA RECIPE~~");
		add("Water, Salt, Olive oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
	}	
	
		public static void makePancakes() {
			System.out.println("         ~~PANCAKES RECIPE~~  ");
			add("Milk, Eggs, Flour, Sugar, Salt");
			mix(120);
			fry(3);
			System.out.println("    ~~ENJOY YOUR DELICIOUS PANCAKES~~");
			System.out.println("");
		}	
		public static void add(String ing) {
		System.out.println("- Add " + ing);
	}
	
	public static void mix(int x) {
		System.out.println("- Mix for " + x + " seconds");
	}
	
	public static void fry(int minutes) {
		System.out.println("- Fry for " + minutes + " minutes");
	}
	
	public static void boil(int minutes) {
		System.out.println("- Boil it for " +  minutes + " minutes");
	}
	
}

