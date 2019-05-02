package day04_primitives_operators;

public class UsingVariables {
   public static void main(String[] args) {
	//declre int variablesnum1, num2, num3
	   
	  int num1, num2, num3;
	  
	  //asigh 100 to num1
	  num1 = 100;
	  //asigh values of num1 to num2
	  num2 = num1;
	  //Print num1 and num2 values in separate lines
	  System.out.println(num1);
	  System.out.println(num2);
	  
	  num2 = 200;
	  num1 = num2;
	  num3 = num1;
	  
	  System.out.println(num1);
	  System.out.println(num2);
	  System.out.println(num3);
	  
	  num1 = 100;

	  num2 = 200;
	  num3 = num1;
	  num1 = num2;
	  
	  System.out.println(num1);
	  System.out.println("num2="+num2);
	  System.out.println("num3="+num3);
	  
	  //declare apples and assign 25
	  int apples = 25;
	  //declare kiwis and assign value of apples to it
	  int kiwis = apples;
	  //declare mangoes and assign 55
	  int mangoes = 55;
	  //assign mangoes to kiwis
	  kiwis = mangoes;//55  
	  
	  System.out.println(apples); // 25
	  System.out.println(kiwis); // 55
	  System.out.println(mangoes); // 55
	  
	  
	  
	  
	  
	  }
}
