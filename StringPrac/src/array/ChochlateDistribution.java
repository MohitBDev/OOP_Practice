package array;

import java.util.Arrays;

public class ChochlateDistribution {

	public static void main(String[] args) {
		int[] arr= {3,4,1,9,56,7,9,12};
		int n=arr.length;
		int s=5;
		
		Arrays.sort(arr);
		int min=arr[arr.length-1];
		
		for(int i=0;i<n-s;i++) {
			int diff=arr[i+s-1]-arr[i];
			if(min>diff) {
				min=diff;
				
			}
			
		}
		System.out.println(min);
		

	}

}
