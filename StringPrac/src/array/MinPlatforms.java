package array;

import java.util.Arrays;

public class MinPlatforms {

	public static void main(String[] args) {
		int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
		int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
		int count = 0;
		int max = 0;
		int i = 0;
		int j = 0;
		int N = arr.length;
		Arrays.sort(arr);
		Arrays.sort(dep);

		while (i < N && j < N) 
		{
			if (arr[i] <= dep[j])
			{
				i++;
				count++;
				if (count > max)
					max = count;
			

			} else {
				count--;
				j++;
				
			}

		}
		System.out.println(count);
		System.out.println(max);

	}

}
