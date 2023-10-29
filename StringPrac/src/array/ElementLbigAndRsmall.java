package array;

import java.util.Arrays;

public class ElementLbigAndRsmall {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 9 };

		int[] min = new int[arr.length];
		int[] max = new int[arr.length];
		int big = arr[0];
		int small = arr[arr.length-1];
		int ele = -1;
		
		
		for (int i =0; i<arr.length; i++) {
			if (arr[i] > big) {
				big = arr[i];
			}
			max[i] = big;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < small)
				small = arr[i];
			min[i] = small;
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && i != arr.length - 1)
				if (max[i] == min[i]) {
					ele = arr[i];
                    break;
				}

		}
		System.out.println(Arrays.toString(min));
		System.out.println(Arrays.toString(max));
		
		System.out.println(ele);

	}

}
