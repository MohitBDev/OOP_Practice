package array;

import java.util.Arrays;

public class Zigzag {
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) {
		int[] arr= {4,3,7,8,6,2,1};
		for(int i=0;i<arr.length-1;i++) {
			if(i%2==0 && arr[i]>arr[i+1])
				swap(arr,i,i+1);
			else if(i%2==1 && arr[i]<arr[i+1])
				swap(arr,i,i+1);
		}
		System.out.println(Arrays.toString(arr));
	}

}
