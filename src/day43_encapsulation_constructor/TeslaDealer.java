package day43_encapsulation_constructor;

public class TeslaDealer {

	public static void main(String[] args) {

		Tesla tesla = new Tesla();
		tesla.setModel("Model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: " + tesla.getModel());
		System.out.println("range: " + tesla.getRange());
		System.out.println("0to60: " + tesla.getZeroTo60());
		System.out.println("price: " + tesla.getPrice());
		System.out.println("selfDriving: " + tesla.isSelfDriving());
		
		System.out.println(tesla);
		System.out.println(tesla.toString());
	}

}
