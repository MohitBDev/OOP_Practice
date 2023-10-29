package DSA;

import java.util.Arrays;


public class MergeSort {
    public static void merge(int[] arr, int l, int mid, int h) {
        int[] b = new int[arr.length];
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= h) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= h) {
                b[k] = arr[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                b[k] = arr[i];
                k++;
                i++;
            }
        }

        for (int x = 0; x < arr.length; x++) {
            arr[x] = b[x];
        }
    }

    public static void mergesort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergesort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
