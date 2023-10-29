package array;

import java.util.Stack;

public class Leaders {
	public static void Lead(int[] arr) {
		int max = arr[arr.length - 1];
		Stack<Integer> s = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] >= max) {
				s.push(arr[i]);
				max = arr[i];
			}

		}
		while(!s.empty()) {
			System.out.println(s.pop());
			
		}

	}

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		Lead(arr);
		int tsum = 0;
		int rsum = 0;
		int lsum = 0;
		for (int a : arr) {
			tsum += a;
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > (tsum - lsum - arr[i])) {
				System.out.print(arr[i] + " ");

			}
			lsum += arr[i];

		}
	}

}
