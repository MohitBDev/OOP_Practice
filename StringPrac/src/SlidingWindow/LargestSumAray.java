package SlidingWindow;

public class LargestSumAray {
	public static int sum(int[] arr,int k) {
		int size=arr.length;
		int i=0;
		int j=0;
		int sum=0;
		int max=0;
		while(j<size) {
			sum+=arr[j];
			
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k){
				max=Math.max(max,sum);
				sum-=arr[i];
				i++;
				j++;
				
			}
			
		}
		System.out.println(i+"  "+j);
		return max;
		
	}

	public static void main(String[] args) {
		int [] arr= {1, 4, 7, 6, 3, 1, 5,7,4};
		System.out.println(sum(arr,4));
		
		
		

	}

}
