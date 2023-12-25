package ds_and_algo;

import java.util.Scanner;

public class GcdOfNumbers {
	public static int findGCD(int a,int b) {
		if(b == 0) {
			return a;
		}
		return findGCD(b,a%b);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		int gcd = findGCD(num1, num2);

		System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

	}
}
