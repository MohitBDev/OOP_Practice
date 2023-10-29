package array;

import java.util.Arrays;

public class Reaarange {
	
	
	public static int[] Arrange(int[] arr) {
		
		int[] ar=new int[arr.length];
		int j=0;
		for (int i=0;i<arr.length;i++) {
			
				if(j<arr.length) {
				ar[j]=arr[arr.length-1-i];
				j++;
				}
				if(j<arr.length) {
					ar[j]=arr[i];
					j++;
				}
			
			
			
		}
		
		
		
		return ar;
		
	}

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {10,20,30,40,50,60,70,80,90,100,110};
		System.out.println(Arrays.toString(Arrange(arr1)));
		System.out.println(Arrays.toString(Arrange(arr2)));
	}

}
