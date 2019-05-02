package day33_methods05;

import day31_methods03.Calculator;

public class CalcTests {

	public static void main(String[] args) {
		System.out.println(WarmUpTask.add(3, 1));
		System.out.println(WarmUpTask.multiply(3, 1));
		System.out.println(WarmUpTask.minus(3, 1));
		System.out.println(WarmUpTask.divide(3, 1));
		
		int addResult = WarmUpTask.add(21, 41);
		double mResult = WarmUpTask.multiply(50,  40);
		double miResult = WarmUpTask.minus(3000, 200);
		double dResult = WarmUpTask.divide(455, 5);
		
		System.out.println("addResult: " + addResult);
		System.out.println("mResult: " + mResult);
		System.out.println("miResult: " + miResult);
		System.out.println("dResult: " + dResult);
		
		double a = 10.0, b = 5.0; 
		double myResult = WarmUpTask.minus(a, b);
		System.out.println("myResult: " + myResult);
		
		double[] dNums = {2.0, 4.0};
		double result2 = WarmUpTask.multiply(dNums[0], dNums[1]);
		System.out.println("result2: " + result2);
		
		if(WarmUpTask.add(10, 16) == 26) {
			System.out.println("Add Unit Test Passed");	
		}else {
			System.out.println("Add Unit test failed");
		}
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is not 4 characters");
		}
	}

}
