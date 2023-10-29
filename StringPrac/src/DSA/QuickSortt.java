package DSA;

import java.util.Arrays;

public class QuickSortt {
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}
	
	public static int partion(int[] arr,int l,int h) {
		int pivot=arr[l];
		int j=h;
		int i=l;
		while(i<j) {
			
			while(arr[i]<=pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<j) {
				swap(arr,i,j);
				
			}
			
		}
		swap(arr,j,l);
		return j;
		
		
	}
	public static void quicksort(int[]arr,int l,int h) {
		if(l<h) {
			int pivot=partion(arr,l,h);
			quicksort(arr, l, pivot-1);
			quicksort(arr, pivot+1, h);
			
		}
		
		
	}

	public static void main(String[] args) {
	 int[] arr= {4,6,2,5,7,9,1,3};
	 System.out.println(Arrays.toString(arr));
	 quicksort(arr,0,arr.length-1);
	 System.out.println(Arrays.toString(arr));

	}

}
