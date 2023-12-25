package ds_and_algo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	public static int[] removeDuplicate(int[] array) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int value : array) {
			set.add(value);
		}
		int[] uniqueArray = new int[set.size()];
		int i = 0;
		for(int value : set) {
			uniqueArray[i++]=value;
		}
		return uniqueArray;
	}
	public static void main(String args[]) {
		int[] array = {1,3,2,2,3,4,5,4};
		
		System.out.println("Original Array: " + Arrays.toString(array));
		
		int[] uniqueArray = removeDuplicate(array);
		
		System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
		
	}
}
