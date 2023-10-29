package array;

public class EquilmPnt {

	public static void equipnt(int[] arr) {
		int tsum = 0;
		int lsum = 0;
		for (int a : arr) {
			tsum += a;
		}

		for (int i = 0; i < arr.length; i++) {
			if (lsum == (tsum - lsum - arr[i])) {
				System.out.println(arr[i]);
			}
			lsum += arr[i];
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2 };
		equipnt(arr);
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {

			sum2 = 0;

			for (int j = i + 1; j < arr.length; j++) {

				sum2 += arr[j];

			}

			if (sum1 == sum2) {
				System.out.println(arr[i]);

			}

			sum1 += arr[i];

		}

	}

}
