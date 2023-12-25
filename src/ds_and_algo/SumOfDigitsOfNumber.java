package ds_and_algo;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static int calculateDigitSum(int num) {
		int sum = 0;

		while(num != 0) {
			int digit = num % 10;
			sum += digit;
			num = num/10;
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int sum = calculateDigitSum(number);
		System.out.println("The sum of digits in the number is: " + sum);
	}
}
