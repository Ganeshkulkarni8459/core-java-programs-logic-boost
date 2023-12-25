package ds_and_algo;

public class swappingWithoutTempVariable {
	public static void main(String args[]) {
		int x = 10;
		int y = 20;
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("x :"+x+" "+"y :"+y);
	}

}
