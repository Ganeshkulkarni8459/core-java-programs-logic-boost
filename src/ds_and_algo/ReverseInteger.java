package ds_and_algo;

public class ReverseInteger {
	public static int reverse(int n) {
		int rev = 0;
		int rem;
		while(n>0) {
			rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
			
		}
		return rev;
	}
	public static void main(String args[]) {
		int number = 12345;
		System.out.println("Reverse :"+reverse(number));
		
		
	
	}

}
