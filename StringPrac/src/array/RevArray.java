package array;

import java.util.Arrays;

public class RevArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int n=arr.length;
        int k=3;
        for(int i=0;i<n;i+=3) {
        	int start=i;
        	int end =Math.min(n-1,i+k-1);
        	while(start<=end) {
        		swap(arr,start,end);
        		start++;
        		end--;
        	}
        	
        }
        System.out.println(Arrays.toString(arr));
      
    }
}
