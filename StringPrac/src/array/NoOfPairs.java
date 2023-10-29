package array;

public class NoOfPairs {
	
	

	public static void main(String[] args) {
		int[] arr1= {2,3,4,5};
		int[] arr2= {1,2,3};

		double x=0;
		double y=0;
		int count=0;
		for (int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				x=Math.pow(arr1[i],arr2[j]);
				y=Math.pow(arr2[j],arr1[i]);
				if(x>y) {
					count++;
				}
				
			}
			System.out.println(count);
			
		}

	}

}
