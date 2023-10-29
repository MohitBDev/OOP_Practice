package array;

import java.util.Arrays;

public class Sortarr {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 1, 2, 0 };
		int mid = 0;
		int high = arr.length - 1;
		int low = 0;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, mid, low);
				low++;
				mid++;

			} else if (arr[mid] == 2) {
				swap(arr, mid, high);
				high--;

			} else
				mid++;

		}

//		for (int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//					
//				}
//				
//			}
//		}
		System.out.println(Arrays.toString(arr));

	}

}
