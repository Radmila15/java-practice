package officehours04_apr22;

import java.util.Arrays;

public class officehours_04_29_removeFroArray {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 1, 1, 6};
		int target = 1; // it means i want to remove all 1s from nums
		//find out how many targets are in nums
		
		int counter = 0;
		//loop and using if condition, increase counter for each match
		for(int n : nums) {
			if(n == target) {
			counter++;
		}
	}
		System.out.println(counter); //3 1s there
		//declare new array with size that does not include target count
		
		int[] newArray = new int[nums.length - counter];
		//loop nums one more time and add all values that are not target
		int idx = 0;
		for(int n : nums) {
			if( n != target) { //(!(n == target))
				newArray[idx] = n;
				idx++; // add 1 so that it moves to next index
			}
		}
		System.out.println(Arrays.toString(nums));	
		System.out.println(Arrays.toString(newArray));
		/*
		 * Method name: removeFromArray
		 * Return type: int[]
		 * Params: int[] nums, int target
		 */
		
		public static int[] removeFromArray(int[] nums, int target) {
			// find out how many targets are in nums
			int counter = 0;
			// loop and using if condition, increase counter for each match
			for (int n : nums) {
				if (n == target) {
					counter++;
				}
			}
			// declare new empty array with size that
			// does not include target count
			int[] newArray = new int[nums.length - counter];
			// loop nums one more time and add all values that are not target
			int idx = 0;
			for (int n : nums) {
				if (n != target) { // (!(n == target))
					newArray[idx] = n;
					idx++; // add 1 so that it moves to next index
				}
			}
			return newArray;
		}

	}
