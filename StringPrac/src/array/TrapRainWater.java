package array;

import java.util.Arrays;

public class TrapRainWater {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 0, 0, 2, 0, 4 };
		//int[] arr = { 3, 0, 0, 2, 0, 5};
		int lmax = 0;
		int rmax = arr.length - 1;
		int sum=0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[lmax] < arr[i]) {
				swap(arr, i, lmax);
			}

		}
		for (int i = arr.length - 1; i >= 1; i--) {
			if (arr[rmax] < arr[i]) {
				swap(arr, i, rmax);
			}

		}
		int n=arr[arr.length-1]-arr[0];
		System.out.println(n);
		for(int i=1;i<arr.length-1;i++) {
		
			sum +=(arr[0]-arr[i]);
			
		}
		System.out.println(sum);
		System.out.println(Arrays.toString(arr));

	}

}
