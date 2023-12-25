package ds_and_algo;

import java.util.Scanner;

public class AvgNumbers {
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in set :");
		int n = sc.nextInt();
		if(n <= 0) {
			System.out.println("Please enter a valid number of elements greater than 0.");
            return;		
        }
		System.out.println("Enter the numbers:");
		int sum = 0;
		for(int i=0; i < n; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		double avg = sum/n; 
		System.out.println("The average of the set is: " + (double)avg);
	}

}
