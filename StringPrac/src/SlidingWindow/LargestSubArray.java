package SlidingWindow;

public class LargestSubArray {
public static int	LarSub(int[] arr,int k){
	 int size = arr.length;
	    int i = 0;
	    int j = 0;
	    int sum = 0;
	    int maxlen = 0;
	    
	    while (j < size) {
	        sum += arr[j];
	        
	        if (sum < k) {
	            j++;
	        } else if (sum == k) {
	            maxlen = Math.max(maxlen, j - i + 1);
	            j++;
	        } else if (sum > k) {
	            while (sum > k) {
	                sum -= arr[i];
	                i++;
	            }
	            j++;
	        }
	    }
	    
	   
	    if (maxlen == 0) {
	        return -1; 
	    }
	    
	    return maxlen;
	}

	public static void main(String[] args) {
		int[] arr= {4,1,1,1,2,3,5};
		System.out.println(LarSub(arr,5));

	}

}
