package ds_and_algo;

public class ArraySortInAscendingOrder {
	public static void sortAscending(int[] a,int total) {
		int n = a.length;
		int temp,i,j;
		for(i=0; i<total; i++) {
			for(j=i+1; j<total; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
	public static void main(String args[]) {
		int arr[] = {5,3,4,6,7};
		System.out.println("Original Array:");
		printArray(arr);

		sortAscending(arr,5);

		System.out.println("\nArray Sorted in Ascending Order:");
		printArray(arr);

	}

}
