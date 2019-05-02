package day18_while_dowhile_loops;

public class StairCase {

	public static void main(String[] args) {

		/*
		 * *
		 * * *
		 * * * *
		 * * * * * 
		 */
		
		
        //1)with counter
		//2)checking length()
		String stairs = "*";
		System.out.println(stairs);
		int num = 1;
		while(num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		
		stairs = "*";
		while(stairs.length() <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
