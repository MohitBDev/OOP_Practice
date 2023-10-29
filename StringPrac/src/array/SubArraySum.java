package array;

public class SubArraySum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int start=0;
		int sum=0;
		int S=15;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			while(sum>S) {
			sum =sum-arr[start];
			start++;
			}
			if(sum==S) {
				System.out.println(sum);
				System.out.println(start+" " +(i+1));
				 
			}
			
		}


	}

}
