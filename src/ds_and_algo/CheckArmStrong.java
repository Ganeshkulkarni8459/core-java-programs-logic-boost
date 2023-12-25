package ds_and_algo;

import java.util.Scanner;

public class CheckArmStrong {
	public static boolean isArmStrong(int number) {
		
		int originalNum ,rem,result = 0,n=0;
		
		originalNum = number;
		
		while(originalNum != 0) {
			originalNum = originalNum/10;
			n++;
		}
		originalNum = number;
		
		while(originalNum != 0) {
			rem = originalNum % 10;
			result = (int) (result + Math.pow(rem, n));
			originalNum = originalNum/10;
		}
		return result == number;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		if(isArmStrong(number)) {
			System.out.println(number + " is an ArmStrong Number.");
		}
		else {
			System.out.println(number + " is not an ArmStrong Number.");
		}
	}

}
