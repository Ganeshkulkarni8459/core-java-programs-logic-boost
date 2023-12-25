package ds_and_algo;

import java.util.Scanner;

public class FactorialOfNumber {
	public static long calculateFactorial(int number) {
		if(number < 0) {
			return -1;
		}
		else if(number == 0 || number == 1) {
			return 1;
		}
		else {
			long result = 1;
			for(int i=2; i<= number; i++) {
				result *= i;
			}
			return result;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number = sc.nextInt();
		
		long factorial  = calculateFactorial(number);
		System.out.println("Factorial is :"+factorial);
	}

}
