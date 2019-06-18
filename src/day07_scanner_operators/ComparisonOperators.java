package day07_scanner_operators;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		//==
		//System.out.println(5 = 5); //true
		System.out.println(50 == 5); //false
		int searchCount = 5000;
		System.out.println(searchCount == 5000);//true
		
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount);
		
		int speedLimit = 55;
		int currentSpeed = 75;
		
		System.out.println(currentSpeed == speedLimit);
		
		boolean atLimit = currentSpeed == speedLimit;
		System.out.println("At Speed Limit: " + atLimit);
		
		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("Over speed limit: " + overLimit);
		
		boolean underLimit = currentSpeed < speedLimit;
		//boolean underLimit = currentSpeed > currentSpeed;
		
		System.out.println("Under limit: " + underLimit);
		
		
		
		
		
		
		

	}

}
