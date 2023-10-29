package SlidingWindow;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class negativeNoInArray {
	private static int[] firstNegativeNo(int[] a, int k) {
		int n = a.length;
		int[] arr = new int[n - k + 1];
		int idx = 0;

		Queue<Integer> q = new LinkedList<>();
		int i = 0;
		int j = 0;

		while (j < n) {

			if (a[j] < 0) {
				q.add(a[j]);
		
			}
			
			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) {
				if (q.isEmpty()) {
					arr[idx++] = 0;
				} else {
					int num=q.peek();
					arr[idx++]=num;
					if(num==a[i]) {
						q.remove();
						
					}

				}
				i++;
				j++;

			}

		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int[] al = firstNegativeNo(arr, 3);
		for (Integer a : al) {
			System.out.println(a);

		}

	}

}
