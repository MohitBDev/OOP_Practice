package array;

import java.util.Arrays;

public class HeapSorting {
	
	
	public static void  heapsort(int [] arr) {
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		for (int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
		 
		
	}
	
	public static void heapify(int[] arr,int n,int i) {
		int larg=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && arr[left]>arr[larg])
			larg=left;
		if(right<n && arr[right]>arr[larg])
			larg=right;
		
		if(larg!=i) {
			int temp=arr[larg];
			arr[larg]=arr[i];
			arr[i]=temp;
			heapify(arr,n,larg);
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr= {5,7,4,2,6,3,1,9,8};
		
		heapsort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
