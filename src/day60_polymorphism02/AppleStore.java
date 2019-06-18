package day60_polymorphism02;

public class AppleStore {

	public static void main(String[] args) {

		AppleDevice mac = new Mac();
		mac.use();
		// mac.code(); code is not visible. Apple Device methods only can be called

		Mac myMac = new Mac();
		myMac.use();
		myMac.code();
		
		AppleDevice watch = new AppleWatch();
		watch.use();
		

	}
}