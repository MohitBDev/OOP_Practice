package array;

public class InversionCount {

	public static void main(String[] args) {
		//int[] arr= {2,3,4,5,6};
	int[] arr= {2,4,1,3,5};
	//	int[] arr= {10,10,10};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j] && i<j) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
