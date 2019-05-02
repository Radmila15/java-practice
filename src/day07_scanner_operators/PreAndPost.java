package day07_scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		int num = 0;
		int num2 = num++;
		
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		
		int n = 0;
		int n2 = ++n;
		System.out.println("n: " + n);
		System.out.println("n2: " + n2);
		
		int i = 10;
		i++; //add 1
		++i; //add 1
		System.out.println("I value:" + i);
		
		
		int bananas = 6; //6
		int pears = bananas++; //7 will goes to apples -7
		int apples = ++bananas; //pears -7,bananas -8
		
		System.out.println(bananas);
		System.out.println(pears);
		System.out.println(apples);
		
		int friends = 10;
		System.out.println(friends++); //10 because ++ on the right side, it's not showing 11 because it is postincrement
		System.out.println(friends); //increase
		
		int p1 = 10;
		int sum = p1++ +5; //p1+5 and assign to sum //p = p+1
		System.out.println("sum: " + sum);
		System.out.println("p1: " + p1);
		
		//===========
				
	    int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries; //
		System.out.println("batteries: " + batteries);//9
		System.out.println("oldBatteries: " + oldBatteries);//6
		System.out.println("totalBaterries: " + totalBatteries); //14
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
