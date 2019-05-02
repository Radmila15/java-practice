package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {

		String[][] pizzas = {
				{"pineaaple", "pepperoni"}, //0
				{"anchovies", "mushroom", "olives"}, //1
				{"4 cheese"}, //2
				{"chicken", "tomatoes", "jalapenios", "onions"}, //3
				{"green peppers", "zuccini","brocolli", "spinach","shrimp"}//4                
        };

//System.out.println(Arrays.toString(pizzas[0]));
for(String[] pizza : pizzas) {
   System.out.print(pizza.length+"-");
   System.out.println(Arrays.toString(pizza));
}

System.out.println("##### FOR LOOP #####");
for(int i = 0; i < pizzas.length; i++) {
   System.out.print(pizzas[i].length + "-");
   System.out.println(Arrays.toString(pizzas[i]));
}

for(String topping : pizzas[2]) {
   System.out.println(topping);
}

int[][] students = {{4,5,6}, 
                  {12,5,7}, 
                  {23,56,12,55,3} 
                  };
//2 parts: outer loop, inner loop
//outer loop will take each group
//inner loop will take each value/student id
for(int[] group : students) {
   for(int studentId : group) {
       System.out.print(studentId +", ");
   }
   System.out.println();
}
		
		
		
	}

}
