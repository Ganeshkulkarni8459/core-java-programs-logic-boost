package ds_and_algo;

import java.util.Arrays;

public class LargestInArray {
	public static int largestInArray(int[] a,int total) {
		
		Arrays.sort(a);
//		int temp,i,j;
//		for(i=0; i<total; i++) {
//			for(j=i+1; j<total; j++) {
//				if(a[i]>a[j]) {
//					temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		return a[total-1];
	}
	public static void main(String args[]) {
		int a[]= {1,3,52,2,89,34};
		System.out.println("Largest Element :"+largestInArray(a,6));
	}

}
