package array;

public class PythTriplet {

	public static void main(String[] args) {
		
		int [] arr= {3,2,4,6,5};
		int a=0;
		int b=0;
		int c=0;
		
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				a=arr[i] * arr[i];
				b=arr[j] * arr[j];
			for(int k=0;k<arr.length;k++) {
				c=arr[k] * arr[k];
				if( a+b==c ) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+arr[k]);
					
				}
			}
				
			}
		}

	}

}
