package ds_and_algo;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestInArray {
	public static int findSecondLargest(int[] arr) {

		Arrays.sort(arr);
		int number = arr[arr.length-2];
		return number;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		int secondLargest = findSecondLargest(arr);
		System.out.println("The second largest element in the array is: " + secondLargest);
	}
}
